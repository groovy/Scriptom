import org.codehaus.groovy.scriptom.*;
import static org.codehaus.groovy.scriptom.tlb.wbemscripting.WbemFlagEnum.*;

//Scriptom.setDebug true
    
Scriptom.inApartment
{
  def locator = new ActiveXObject('WbemScripting.SWbemLocator')
  def services = locator.ConnectServer('.')

  for(process in services.ExecQuery('SELECT * FROM Win32_Process', 'WQL', wbemFlagForwardOnly))
  {
    println "************************************************************"
    for(prop in process.Properties_)
    {
      println "\t${prop.Name} : ${prop.Value}"
    }
  }
  println "Done."
}