import org.codehaus.groovy.scriptom.*;

Scriptom.inApartment
{
  def ie = new ActiveXObject('InternetExplorer.Application')

  ie.Visible = true
  ie.AddressBar = true

  ie.Navigate "http://glaforge.free.fr/weblog"
}