import org.codehaus.groovy.scriptom.*;
import org.codehaus.groovy.scriptom.tlb.ie.*;

/**
 * Adapted from the Jacob unittest for IE events which was 
 * contributed by Niels Olof Bouvin
 * and Henning Jae.<p>
 *
 * Of course, this version is alot easier to read.
 * 
 * @author Jason Smith
 */

//To see all events, uncomment next line.
//System.setProperty("org.codehaus.groovy.scriptom.debug", "true")

volatile boolean done = false;

int delay = 15000; // msec

Scriptom.inApartment
{
  ActiveXObject ie = new ActiveXObject('InternetExplorer.Application').toInterface(SHDocVw.IWebBrowser)

  println "SUPPORTED INTERFACES:"
  SHDocVw.interfaces.each {name, iid -> if(ie.supportsInterface(iid)) println "\t$name"}

  ie.Visible = true
  ie.AddressBar = true
  ie.StatusText = 'My Status Text'
  
  println "IETestThread: ${ie.Path}"

  println "Setting up events."
  ie.events.ProgressChange  = {args -> println "\tEVENT (${Thread.currentThread().getName()}): ProgressChange  - ${args.toString()}"}
  ie.events.BeforeNavigate2 = {args -> println "\tEVENT (${Thread.currentThread().getName()}): BeforeNavigate2 - ${args.toString()}"}
  ie.events.OnQuit          = {args -> done=true}

  println "Navigate to SourceForge.net"
  ie.Navigate "http://sourceforge.net/projects/jacob-project"
  sleep delay
  
  println "Navigate to CodeHaus.org"
  ie.Navigate "http://groovy.codehaus.org/COM+Scripting"
  sleep delay
  
  println "Quitting..."
  ie.Quit()

  //Wait for done, or IE may lock up on Scriptom.releaseComResources()
  def now = System.currentTimeMillis()
  while(!done && System.currentTimeMillis() - now < 10000)
    sleep 10
}