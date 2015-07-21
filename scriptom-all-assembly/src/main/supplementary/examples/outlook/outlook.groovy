import org.codehaus.groovy.scriptom.*;
import org.codehaus.groovy.scriptom.tlb.office.outlook.OlDefaultFolders;
import org.codehaus.groovy.scriptom.tlb.office.outlook.OlAttachmentType;

/**
 * Opens an Outlook email message file (*.msg file) and reads 
 * the header and body data from it.<p>
 *
 * In most cases, since this is accessing Outlook externally, a message box will
 * ask the user to confirm that this operation is allowed.  Refer to the 
 * following article for more information.<p>
 *
 * To use Outlook to process emails on the server, you have to disable the warning
 * dialog.  And depending on your circumstances, it might not be possible to do so.<p>
 *
 * http://outlookcode.com/article.aspx?id=52
 */
Scriptom.inApartment
{
  def app = new ActiveXObject('Outlook.Application.11')


  def mail = app.CreateItemFromTemplate(new File('test.msg').canonicalPath, app.Session.GetDefaultFolder(OlDefaultFolders.olFolderDrafts))
	
  println """
From:    ${mail.SenderName}
To:      ${mail.To}
CC:      ${mail.CC}
Subject: ${mail.Subject}

Body:
******************************************************************
${mail.body}
******************************************************************
"""

  println "ATTACHMENTS:"
  
  for(attachment in mail.Attachments)
  {
    if(attachment.Type == OlAttachmentType.olByValue || attachment.Type == OlAttachmentType.olEmbeddeditem)
    {
      println "\t${attachment.DisplayName}"
    }
  }
}