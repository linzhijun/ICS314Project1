import java.util.ArrayList;
import java.util.HashMap;


/**
 * Java Log (Jog) facility that provides basic logging for debugging.
 *
 */
public class Jog {

  private static Logger                   logger = null;
  private static HashMap<Level, Boolean>  levels = new HashMap<Level, Boolean>();

  /**
   * Enable a specific logging level.
   * @param level Level of logging to enable.
   */
  public static void enableLevel(Level level) {
    levels.put(level, true);
  }

  /**
   * Disables a specific logging level.
   * @param level Log level to disable.
   */
  public static void disableLevel(int level) {
    levels.remove(level);
  }

  /**
   * Adds a logging facility.
   * @param logger Instance of a class that implements "Logger" interface.
   */
  public static void setLogger(Logger newLogger) {
    logger = newLogger;
  }


  
  public static void begin(String msg) {
	    if (logger != null && levels.get(Level.BEGIN) != null) {
	      logger.log(Level.BEGIN, logger.prefix(Level.BEGIN) + msg);
	    }
	  }

  public static void prodid(String msg) {
	    if (logger != null && levels.get(Level.PRODID) != null) {
	      logger.log(Level.PRODID, logger.prefix(Level.PRODID) + msg);
	    }
	  }
  
  public static void version(String msg) {
	    if (logger != null && levels.get(Level.VERSION) != null) {
	      logger.log(Level.VERSION, logger.prefix(Level.VERSION) + msg);
	    }
	  }
  
  public static void calscale(String msg) {
	    if (logger != null && levels.get(Level.CALSCALE) != null) {
	      logger.log(Level.CALSCALE, logger.prefix(Level.CALSCALE) + msg);
	    }
	  }
  
  public static void dtstart(String msg) {
	    if (logger != null && levels.get(Level.DTSTART) != null) {
	      logger.log(Level.DTSTART, logger.prefix(Level.DTSTART) + msg);
	    }
	  }
  
  public static void dtend(String msg) {
	    if (logger != null && levels.get(Level.DTEND) != null) {
	      logger.log(Level.DTEND, logger.prefix(Level.DTEND) + msg);
	    }
	  }
  
  public static void description(String msg) {
	    if (logger != null && levels.get(Level.DESCRIPTION) != null) {
	      logger.log(Level.DESCRIPTION, logger.prefix(Level.DESCRIPTION) + msg);
	    }
	  }
  
  public static void location(String msg) {
	    if (logger != null && levels.get(Level.LOCATION) != null) {
	      logger.log(Level.LOCATION, logger.prefix(Level.LOCATION) + msg);
	    }
	  }
  
  public static void summary(String msg) {
	    if (logger != null && levels.get(Level.SUMMARY) != null) {
	      logger.log(Level.SUMMARY, logger.prefix(Level.SUMMARY) + msg);
	    }
	  }
  
  public static void end(String msg) {
	    if (logger != null && levels.get(Level.END) != null) {
	      logger.log(Level.END, logger.prefix(Level.END) + msg);
	    }
	  }
  
  /**
   * Prings the current content of a log.
   *
   * Dumps the current contents of a log to the console or does nothing if the
   * logger doesn't support this.
   */
  public static void printLog() {
    logger.print();
  }

}
