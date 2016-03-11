import java.util.Scanner;

/**
 *Authors: Team Tres
 *First Team Deliverable
 *Demo for iCalendar;
 *February 25, 2016
 */
public class Test {

public static Scanner inText = new Scanner(System.in);

  public static void main(String[] args) {    

	    Jog.setLogger(new FileLogger("test.ics"));
	    
	    //Scanner inText = new Scanner(System.in);
      
	    
	    String loc; //location
	    String sum; //summary
	    String desc; //
	    String geopos; //
	    String strt; //
	    String end; //
      String cls; //
	    
	    Jog.enableLevel(Level.BEGIN);
	    Jog.enableLevel(Level.CALSCALE);
	    Jog.enableLevel(Level.PRODID);
	    Jog.enableLevel(Level.DESCRIPTION);
	    Jog.enableLevel(Level.VERSION);
	    Jog.enableLevel(Level.DESCRIPTION);
	    Jog.enableLevel(Level.END);
	    Jog.enableLevel(Level.DTSTART);
	    Jog.enableLevel(Level.DTEND);
	    Jog.enableLevel(Level.LOCATION);
	    Jog.enableLevel(Level.SUMMARY);
	    Jog.enableLevel(Level.GEO);
      Jog.enableLevel(Level.CLASS);
	    
      System.out.println("blank inputs are not read");
      
	    System.out.println("Please enter location: ");
	    loc = getIn();
	    
	    System.out.println("Please enter summary: ");
	    sum = getIn();
	    
	    System.out.println("Please enter description: ");
	    desc = getIn();
	    
	    System.out.println("Please enter geographical position (format: "
	    		+ "37.386013;"
	    		+ "-122.082932): ");
	    geopos = getIn();
	    
	    System.out.println("Please enter start time (format: 20160225T153000Z): ");
	    strt = getIn();
	    
	    System.out.println("Please enter end time (format: 20160225T163000Z): ");
	    end = getIn();
      
      System.out.println("Please enter a classification (format: PUBLIC, PRIVATE, CONFIDENTIAL, or IANA-TOKEN (all caps))): ");
	    cls = getIn();
	    
	    /*
	    Jog.begin("VCALENDAR");
	    Jog.prodid("-//Kerwin Yadao//ics314 1.0//EN");
	    Jog.version("2.0");
	    Jog.calscale("GREGORIAN");
	    Jog.begin("VEVENT");
	    Jog.dtstart("20160225T153000Z");
	    Jog.dtend("20160225T163000Z");
	    Jog.description("super desc");
	    Jog.location(k);
	    Jog.summary("asdf");
	    Jog.end("VEVENT");
	    Jog.geo("37.386013;-122.082932");
	    Jog.end("VCALENDAR");
	    */
	    
	    Jog.begin("VCALENDAR");
	    Jog.prodid("-//Kerwin Yadao//ics314 1.0//EN");
	    Jog.version("2.0");
	    Jog.calscale("GREGORIAN");
	    Jog.begin("VEVENT");
	    Jog.dtstart(strt);
	    Jog.dtend(end);
	    Jog.description(desc);
	    Jog.location(loc);
	    Jog.summary(sum);
      Jog.geo(geopos);
      Jog.Class(cls);
	    Jog.end("VEVENT");
	    Jog.end("VCALENDAR");
	    
	    Jog.printLog();
	    
  }
  
  
  /* Function getIn
     Asks for user input, asks again if the input is blank
     returns the string input
  */
  private static String getIn() {
      //Scanner inText = new Scanner(System.in);
      
      String var = "";
      
      while(var.equals("")) {
          var = inText.nextLine();
      }
      return(var);
  }

}
