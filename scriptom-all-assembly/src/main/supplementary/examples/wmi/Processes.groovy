import org.codehaus.groovy.scriptom.*;
import static org.codehaus.groovy.scriptom.tlb.wbemscripting.WbemFlagEnum.*;
import static org.codehaus.groovy.scriptom.util.wbemscripting.WbemDateTime.*;

//Scriptom.setDebug true
    
Scriptom.inApartment
{
  def locator = new ActiveXObject('WbemScripting.SWbemLocator')
  def services = locator.ConnectServer('.')

  for(process in services.ExecQuery('SELECT * FROM Win32_Process', 'WQL', wbemFlagForwardOnly))
  {
    if(!Scriptom.isNull(process.CreationDate))
    {
      //CAREFUL! WMI returns dates as a Wbem-formatted string, 64-bit Ints as a string.
      //This code prints out the process handle, creation date, name, and time on the CPU.
      print "${process.Handle}".padRight(5)
      print "${toJavaDate(process.CreationDate)} - "
      print "${process.Name}".padRight(30)
      print "${(Long.parseLong(process.KernelModeTime) + Long.parseLong(process.UserModeTime)) / 10000 / 1000} sec".padLeft(16)
      println()
    }
  }
}