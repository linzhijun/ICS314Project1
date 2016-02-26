
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Log to a file.
 *
 */
public class FileLogger implements Logger {

  /** The name of the file. */
  private String fileName;  
  private FileWriter logWriter;
  
  /**
   * Constructor.
   * 
   * @param fileName The filename to log to
   * 
   * @throws IOException
   */
  FileLogger(final String fileName) {
    try {
      this.fileName = fileName;
      logWriter = new FileWriter(this.fileName);
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
  
  
  @Override
  public final void log(final Level logLevel, final String msg) {
    try {
      logWriter.write( logLevel.toString() + ":" + msg + "\n");
      logWriter.flush();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }

  
  @Override
  public String prefix(final Level logLevel) {
    return "";
  }

  
  @Override
  public void print() {
    try {
      BufferedReader logReader = new BufferedReader(new FileReader(fileName));
      
      String currentLine;
      
      while ((currentLine = logReader.readLine()) != null) {
        System.out.println(currentLine);
      }
      
      logReader.close();
      
      
    } catch (IOException e) {
      e.printStackTrace();
    }

    
  }

}
