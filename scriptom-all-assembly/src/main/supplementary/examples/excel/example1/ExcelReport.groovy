import org.codehaus.groovy.scriptom.*;

import org.codehaus.groovy.scriptom.tlb.office2007.excel.XlChartType
import org.codehaus.groovy.scriptom.tlb.office2007.excel.XlSheetType
import org.codehaus.groovy.scriptom.tlb.office2007.excel.XlRowCol
import org.codehaus.groovy.scriptom.tlb.office2007.excel.XlChartLocation
import org.codehaus.groovy.scriptom.tlb.office2007.excel.Excel;

import org.codehaus.groovy.scriptom.util.office2007.ExcelHelper;

import java.text.SimpleDateFormat;

/**
 * Shows you how to use {@code ExcelHelper} to create Excel documents from a template, and
 * then how to read the results using a SafeArray.
 *
 * @author Jason Smith
 */

//System.setProperty 'org.codehaus.groovy.scriptom.debug', 'true'

final reportFile = new File('./report.xlsx').canonicalFile

println """
  CREATING A SPREADSHEET FROM A TEMPLATE:
  
  Opening Excel template, inserting data, and creating a chart.
  The output document is '${reportFile.path}'.
"""

def helper = new ExcelHelper()
helper.create(new File("./reporttemplate.xlsx"), reportFile)
{workbook ->
  def worksheet = workbook.Sheets.Item[1]
  worksheet.Name = 'DATA'


  //***EVENTS***
  //  This next section attaches a handler for the Change event to the Worksheet.
  //  IMPORTANT! You have to specify the correct prog-id for Excel objects that use events!
  //             For many objects, Scriptom doesn't need this additional information.
  //             For MSOffice and IE, you have to tell Scriptom which type you are using.
  worksheet.events.useProgId(Excel.progIds.Worksheet)

  //Hopefully this makes it a little more clear.
  assert '{000208D8-0000-0000-C000-000000000046}' == Excel.Worksheet //Represents the default interface
  assert Excel.Worksheet == Excel._Worksheet
  assert worksheet.supportsInterface(Excel.Worksheet)
  
  /*
   * Microsoft broke a contract and removed the version-independent progId for Excel.Sheet between Office 2003 and
   * Office 2008.  This makes in necessary to program towards a specific version of Excel.
   */
  assert 'Excel.Sheet.8' == Excel.progIds.Worksheet
  assert 'Excel.Sheet.8' == Excel.progIds[Excel.coClasses.keySet().find{name->worksheet.supportsInterface(Excel.coClasses[name])}]
  
  
  //Event 'Change' - 1 parameter which is an Excel.Range. 
  //  Since we are changing one cell at a time, we can assume the the range represents 1 cell.
  //  That's not always a valid assumption!
  worksheet.events.Change = 
    {args -> 
      println "\tEVENT Change (${args[0].Column},${args[0].Row}) = ${args[0].Value}"
    }
  
  
  //Put some data into the worksheet.
  (1..12).each
  {row ->
    worksheet.Cells.Item[row+1,1] = "$row/1/2007"
    
    (1..5).each
    {col ->
      worksheet.Cells.Item[row+1,col+1] = (row + col)  
    }
  }
  
  //Create a chart from the data we just inserted.
  def chart = workbook.Charts.Add(Scriptom.MISSING, worksheet) 
  chart.ChartType = XlChartType.xlColumnStacked
  chart.SetSourceData(worksheet.Range("A1:F13"), XlRowCol.xlColumns)
  chart.Location(XlChartLocation.xlLocationAsNewSheet)
  
  chart.HasTitle = true
  chart.ChartTitle.Caption = "This is a Groovy Chart!"
  chart.Name = "Groovy-Chart"
}


println """
  READING DATA FROM EXCEL (NO CHANGES SAVED):
  
  We can also read the report.  Reading Excel worksheets cell by cell is painfully slow
  if you have a lot of data.  Hey, you are talking to another process, so don't expect
  'fast' here.  
  
  To speed things up, use a SafeArray.  When you get a SafeArray from Excel, all the values
  are copied into the local process memory. Access is much faster than going back to Excel 
  for each value.
"""

helper.process(new File("./report.xlsx"))
{workbook ->
  def worksheet = workbook.Sheets.Item['DATA'] 
  assert worksheet.supportsInterface(Excel._Worksheet)
  
  SafeArray a = worksheet.UsedRange.Value
  println "\t${a.toString()}"
  println()
  
  a.bounds[0].each
  {row->
    print "\t"
    a.bounds[1].each
    {col->
      if(a[row,col] instanceof String)
        print "[${a[row,col]}]".center(10)
      else if(a[row,col] instanceof Date)
      {
        def f = new SimpleDateFormat('MM/yyyy')
        print f.format(a[row,col]).center(10)
      }
      else
        print a[row,col].toString().center(10)
    }
    println()
  }
}