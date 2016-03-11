import java.util.Scanner;

/**
 *Authors: Team Tres
 *First Team Deliverable
 *Demo for iCalendar;
 *February 25, 2016
 */
public class Test {
	public static Scanner inText = new Scanner(System.in);
	
	  public static String stringR(Scanner inText) {
    	  String UI = null;
    	  Boolean isEmpty = true;

    	  while (isEmpty) {
    	   UI = inText.nextLine();
    	   if (UI != null) {
    	    isEmpty = false;
    	   }
    	  }
    	  return UI;
    	 }
	  
  public static void main(String[] args) {    

	    Jog.setLogger(new FileLogger("test.ics"));
	    
	    //Scanner inText = new Scanner(System.in);
	    //public static Scanner inText = new Scanner(System.in);
	    
	    String k;
	    String b;
	    String s;
	    String v;
	    String q;
	    String y;
      String cls;
      	int w;
      	int op;
      	int oy;
      	int oi;
      	int lj;
      	int lk; 
      	int lu;
      	int lp;
	    
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
	    
	    System.out.println("Please enter location: ");
	    k = inText.nextLine();
	    
	    System.out.println("Please enter summary: ");
	    b = inText.nextLine();
	    
	    System.out.println("Please enter description: ");
	    s = inText.nextLine();
	    
	    System.out.println("Please enter geographical position (format: "
	    		+ "37.386013;"
	    		+ "-122.082932): ");
	    v = inText.nextLine();
	    
	    System.out.println("Please enter start time (format: 20160225T153000Z): ");
	    q = inText.nextLine();
	    
	    System.out.println("Please enter end time (format: 20160225T163000Z): ");
	    y = inText.nextLine();
      
      System.out.println("Please enter a classification (format: PUBLIC, PRIVATE, CONFIDENTIAL, or IANA-TOKEN (all caps))): ");
	    cls = inText.nextLine();
	    
	    System.out.println("Please enter start year: ");
	    w = inText.nextInt();
	    
	    System.out.println("Please enter start Month: ");
	    op = inText.nextInt();
	    
	    System.out.println("Please enter start day: ");
	    oy = inText.nextInt();
	    
	    System.out.println("Please enter start hour: ");
	    oi = inText.nextInt();
	    
	    System.out.println("Please enter end year: ");
	    lj = inText.nextInt();
	    
	    System.out.println("Please enter end month: ");
	    lk = inText.nextInt();
	    
	    System.out.println("Please enter end day: ");
	    lu = inText.nextInt();
	   
	    System.out.println("Please enter end hour: ");
	    lp = inText.nextInt();
	    
	    
	    
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
	    Jog.dtstart(w + "" + op + "" + oy + "T" + oi + "00" + "Z");
	    Jog.dtend(lj + "" + lk + "" + lu + "T" + lp + "00" + "Z");
	    Jog.description(s);
	    Jog.location(k);
	    Jog.summary(b);
      Jog.geo(v);
      Jog.Class(cls);
	    Jog.end("VEVENT");
	    Jog.end("VCALENDAR");
	    
	    Jog.printLog();
	    
  }

}
