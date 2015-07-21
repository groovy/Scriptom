package org.codehaus.groovy.scriptom.util.office2007;

import org.codehaus.groovy.scriptom.Scriptom
import org.codehaus.groovy.scriptom.ActiveXObject
import org.codehaus.groovy.scriptom.tlb.office2007.MsoAutomationSecurity
import org.codehaus.groovy.scriptom.tlb.office2007.MsoFeatureInstall
import org.codehaus.groovy.scriptom.tlb.office2007.excel.Excel

/**
 * This helper contains all you need to process data out of existing Excel files
 * or create new Excel files based on a template - <b>reliably</b> - at the 
 * server.<p>
 *
 * First, Excel is tricky to get working on the server, particularly on startup
 * and saving results.  The .xls or .xlt file that Excel opens must never have
 * any other locks on it, or Excel throws up a dialog.  To prevent this, we always
 * copy the input file to a temporary file, and then copy the temporary file to
 * the desired output file (since the output file might already exist, it is
 * as much a potential problem as the input file).<p>
 *
 * Second, there are a number of flags that must be set just so to suppress 
 * various potential dialogs that can pop up.  These include:
 * <ul>
 *   <li>Visible - false</li>
 *   <li>DisplayAlerts - false</li>
 *   <li>AutomationSecurity - force disable</li>
 *   <li>AlertBeforeOverwriting - false</li>
 *   <li>AskToUpdateLinks - false</li>
 *   <li>FeatureInstall - none</li>
 * </ul>
 *
 * As a finishing touch, the request to {@code ExcelHelper} is run in a
 * MTA (Multi-Threaded Apartment model), so it can run from any thread in the
 * process.
 *
 * @author Jason Smith
 */
class ExcelHelper
{
  Boolean debug
  
  ExcelHelper()
  {
    this(false);
  }
  
  ExcelHelper(Boolean debug)
  {
    this.debug = debug
  }
  
  /**
   * Process a .xls file without saving the results.  This is intended for
   * reading Excel files.
   *
   * @param inputXL Input .xls file to process.
   */
  void process(File inputXL, Closure closure)
  {
    create(inputXL, null, closure)
  }
  
  /**
   * Create a new .xls file based on a template (.xls or .xlt).  
   *
   * @param templateXL The template .xls or .xlt file.
   * @param outputXL The file to save changes to.
   * @return The file created (same as outputXL).
   */
  File create(File templateXL, File outputXL, Closure closure)
  {
    Scriptom.inApartment
    {
      def xlApp = new ActiveXObject(Excel.progIds.Application)
  
      //Visibility should be set to FALSE for production.
      xlApp.Visible = debug
  
      //Alerts must be turned off or a confirmation dialog will display when we close the workbook.
      //That's bad in a server environment.
      xlApp.DisplayAlerts = false
      
      //Turn off macro processing explicitly.  This gets rid of the optional security dialog, and
      //also boosts security.  
      xlApp.AutomationSecurity = MsoAutomationSecurity.msoAutomationSecurityForceDisable
      
      //Turns off dialog for overwrite on save. 
      xlApp.AlertBeforeOverwriting = false
  
      //Turns off update links dialog.
      xlApp.AskToUpdateLinks = false;
  
      //Turns off automatic feature install dialog.
      xlApp.FeatureInstall = MsoFeatureInstall.msoFeatureInstallNone 
      
      File tempFile = File.createTempFile('~XL', '.tmp').canonicalFile;
      try
      {
        copy templateXL, tempFile
        def workbook = xlApp.Workbooks.Add(tempFile.path);
  
        try
        {
          closure workbook
        }
        finally
        {
          if(outputXL == null)
          {
            workbook.Close(); 
          }
          else
          {
            //Save to file on close.
            workbook.Close(true, tempFile.path)
          }
          xlApp.Workbooks.Close();
          xlApp.Quit();
          sleep 1000
        }
        
        if(outputXL == null)
        {
          return null;
        }
        else
        {
          return copy(tempFile, outputXL.canonicalFile)
        }
      }
      finally
      {
        tempFile.delete();
      }
    }
  }
  
  private File copy(File source, File dest)
  {
    FileInputStream fis = new FileInputStream(source);
    try
    {
      FileOutputStream fos = new FileOutputStream(dest, false);
      try
      {
        byte[] buf = new byte[4096];
        while (true)
        {
          int count = fis.read(buf);
          if (count == -1) break
          fos.write(buf, 0, count);
        }
      }
      finally
      {
        fos.close();
      }
    }
    finally
    {
      fis.close();
    }

    dest.setLastModified(source.lastModified());

    return dest;
  }
}
