import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *Authors: Team Tres
 *First Team Deliverable
 *Demo for iCalendar;
 *February 25, 2016
 */
public class Reader {

public static Scanner inText = new Scanner(System.in);

	public static void getInput() {
		  String LogFile = "test.ics";
		  
		  String line = null;
		  String line2 = null;
      String line3 = null;
		  
		  try {
		            
		            FileReader fileReader = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader = new BufferedReader(fileReader);

		            while((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		                line2 = "";
		                
		                for (int x = 0; x < line.length();x++) {
                      
                      System.out.println(line2);
                      
                      if(line2.equals("SUMMARY:") ){
                          line3 = line3 + line.charAt(x);
                      }
                      else {
                          line2 = line2 + line.charAt(x);
                      }
                      
		                }
		                
		            }   
		            System.out.println("Summary is: " + line3);
		            bufferedReader.close();         
		  } 
		        
		        catch(IOException ex) {
		            ex.printStackTrace();                 
		        }
	}//end of method



  public static void main(String[] args) { 
    getInput();
  }





}
