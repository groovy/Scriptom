import org.codehaus.groovy.scriptom.*

Scriptom.inApartment
{
  def scriptControl = new ActiveXObject("ScriptControl")
  scriptControl.Language = "JScript"
  println scriptControl.Eval('2.0 + 2.0;')
}