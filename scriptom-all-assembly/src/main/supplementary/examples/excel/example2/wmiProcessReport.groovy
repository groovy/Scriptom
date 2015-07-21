import org.codehaus.groovy.scriptom.*
import static org.codehaus.groovy.scriptom.tlb.wbemscripting.WbemFlagEnum.*
import static org.codehaus.groovy.scriptom.util.wbemscripting.WbemDateTime.*
import org.codehaus.groovy.scriptom.tlb.office2007.excel.*
import org.codehaus.groovy.scriptom.util.office2007.ExcelHelper

def services = [:]

Scriptom.inApartment
{
  def swbemServices = new ActiveXObject('WbemScripting.SWbemLocator').ConnectServer(".")
  for(service in swbemServices.ExecQuery("SELECT * FROM Win32_Service WHERE state='Running' AND status='OK' AND started=true", 'WQL', wbemFlagForwardOnly))
  { 
    def process = swbemServices.ExecQuery("SELECT * FROM Win32_Process WHERE ProcessId=${service.ProcessId}", 'WQL', wbemFlagForwardOnly).find {it.ProcessId == service.ProcessId}
      
    if(process != null)
    {
      services[service.Name] = 
        [
          name           : service.Name,
          displayName    : service.DisplayName,
          process        : process.Name,
          kernelModeTime : process.KernelModeTime as BigInteger,
          userModeTime   : process.UserModeTime as BigInteger,
          creationDate   : toJavaDate(process.CreationDate),
          workingSetSize : process.WorkingSetSize as BigInteger
        ]
    }
  }
  
  services.values().each 
  {service ->
    service.load = ((service.kernelModeTime + service.userModeTime) / 10000) / (System.currentTimeMillis() - service.creationDate.time)
  }
  
  new ExcelHelper().create(new File("./template.xlsx"), new File("./report.xlsx"))
  {workbook ->
    def worksheet1 = workbook.Sheets.Item[1]
    worksheet1.Name = 'By-Creation'
    dumpServices(services.values().sort {a, b -> a.creationDate <=> b.creationDate}, worksheet1)
    
    def worksheet2 = workbook.Sheets.Item[2]
    worksheet2.Name = 'By-Size'
    dumpServices(services.values().sort {a, b -> b.workingSetSize <=> a.workingSetSize}, worksheet2)

    def worksheet3 = workbook.Sheets.Item[3]
    worksheet3.Name = 'By-Load'
    dumpServices(services.values().sort {a, b -> b.load <=> a.load}, worksheet3)
  };
}

private dumpServices(services, worksheet)
{
  def col = 1
  ['Name', 'Process', 'Created', 'Working Set', 'Load %'].each 
  {
    def cell = worksheet.Cells.Item[1, col++]
    cell.Value = it
    cell.Font.Bold = true
  };

  def row = 2  
  services.each
  {service ->
    worksheet.Cells.Item[row, 1] = service.displayName
    worksheet.Cells.Item[row, 2] = service.process
    worksheet.Cells.Item[row, 3] = service.creationDate
    worksheet.Cells.Item[row, 4] = service.workingSetSize
    worksheet.Cells.Item[row, 5] = service.load * 100
    
    row++  
  }
}
