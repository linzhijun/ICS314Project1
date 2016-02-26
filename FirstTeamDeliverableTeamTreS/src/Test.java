/**
 *Authors: Team Tres
 *First Team Deliverable
 *Demo for iCalendar;
 *February 25, 2016
 */
public class Test {
  public static void main(String[] args) {    

	    Jog.setLogger(new FileLogger("test.ics"));
	    	    
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
	    

	    Jog.begin("VCALENDAR");
	    Jog.prodid("-//Kerwin Yadao//ics314 1.0//EN");
	    Jog.version("2.0");
	    Jog.calscale("GREGORIAN");
	    Jog.begin("VEVENT");
	    Jog.dtstart("20160225T153000Z");
	    Jog.dtend("20160225T163000Z");
	    Jog.description("super desc");
	    Jog.location("someplace");
	    Jog.summary("asdf");
	    Jog.end("VEVENT");
	    Jog.end("VCALENDAR");
	    
	    Jog.printLog();
	    
  }

}
