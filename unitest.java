import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *Authors: Team Tres
 *First Team Deliverable
 *Demo for iCalendar;
 *February 25, 2016
 */
public class unitest {

	public static Scanner inText = new Scanner(System.in);

	public int square(int x){
		return x*x;
	}

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


	public static int intR(Scanner inText) {
		int UI = 0;	
		// read only integer 
		try {
			UI = inText.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Input is not an integer");

		}

		inText.nextLine();
		return UI;
	}
	public static float floatR(Scanner inText) {
		float UI = 0;	
		// read only integer 
		try {
			UI = inText.nextFloat();

		} catch (InputMismatchException e) {
			System.out.println("Input is not an integer");

		}

		inText.nextLine();
		return UI;
	}



	public static void main(String[] args) {    

		int number = 0;
		boolean isNumber;

		Jog.setLogger(new FileLogger("test.ics"));

		//Scanner inText = new Scanner(System.in);


		String loc; //location
		String sum; //summary
		String desc; //
		String geopos; //
		String strt; //
		String end; //
		String cls = getClassification();

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
		loc = stringR(inText);

		System.out.println("Please enter summary: ");
		sum = stringR(inText);

		System.out.println("Please enter description: ");
		desc = stringR(inText);
		do{
			System.out.println("Please enter geographical position (format: "
					+ "37.386013;"
					+ "-122.082932): ");
			if (inText.hasNextInt()){
				number = inText.nextInt();
				isNumber = true;
			}
			else{
				System.out.println("Wrong Input");
				isNumber = false;
				inText.next();
			}
			geopos = stringR(inText);
		}while (!(isNumber));
		System.out.println(number);


		do{
			System.out.println("Please enter start time (format: 20160225T153000Z): ");
			if (inText.hasNextInt()){
				number = inText.nextInt();
				isNumber = true;
			}
			else{
				System.out.println("Wrong Input");
				isNumber = false;
				inText.next();
			}
			strt = stringR(inText);
		}while (!(isNumber));
		System.out.println(number);
		do{
			System.out.println("Please enter end time (format: 20160225T163000Z): ");
			if (inText.hasNextInt()){
				number = inText.nextInt();
				isNumber = true;
			}
			else{
				System.out.println("Wrong Input");
				isNumber = false;
				inText.next();
			}
			end = stringR(inText);
		}while (!(isNumber));
		System.out.println(number);




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
	/* Function getClass
    Asks user for input, depending on the input outputs
    PUBLIC, PRIVATE, CONFIDENTIAL, IANA-TOKEN, or x-name
    If the input is non an integer, output is automatically set to PUBLIC
	 */
	private static String getClassification() {
		//Scanner inText = new Scanner(System.in);

		int input = 0;
		int loop = 1; //control variable for the loop, if 1 continues loop. if 0 ends loop
		String output = "PUBLIC";

		System.out.println("Press 1 for PUBLIC, press 2 for PRIVATE, press 3 for CONFIDENTIAL, Press 4 for iana-token, Press 5 for x-name");
		while(loop == 1) {

			try {
				input = inText.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Input is not an integer");
				break;
			}

			if(input == 1) {
				output = "PUBLIC";
				loop = 0;
			}
			else if(input == 2) {
				output = "PRIVATE";
				loop = 0;
			}
			else if(input == 3) {
				output = "CONFIDENTIAL";
				loop = 0;
			}
			else if(input == 4) {
				output = "iana-token";
				loop = 0;
			}
			else if(input == 5) {
				output = "x-name";
				loop = 0;
			}
		}
		inText.nextLine();
		return(output);
	}

	/* Function getIn
     Asks for user input, asks again if the input is blank
     returns the string input
	 */


}
