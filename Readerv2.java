import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

/**
 *Authors: Team Tres
 *First Team Deliverable
 *Demo for iCalendar;
 *February 25, 2016
 */
public class Readerv2 {

public static Scanner inText = new Scanner(System.in);

	public static void getInput() {
		  String LogFile = "test.ics";
		  
		  String line = null;
		  String line2 = null;
		  String line3 = "";
		  String line4 = null;
		  String line5 = null;
		  String line6 = "";
		  String line7 = null;
		  String line8 = null;
		  String line9 = "";
		  String line10 = null;
		  String line11 = null;
		  String line12 = "";
		  String line13 = null;
		  String line14 = null;
		  String line15 = "";
		  String line16 = null;
		  String line17 = null;
		  String line18 = "";
		  String line19 = null;
		  String line20 = null;
		  String line21 = "";
		  String line22 = null;
		  String line23 = null;
		  String line24 = "";
		  String line25 = null;
		  String line26 = null;
		  String line27 = "";
		  String line28 = null;
		  String line29 = null;
		  String line30 = "";
		  
		  
		  //ArrayList<String> list = new ArrayList<String>();
		  ArrayList<Event> newAL = new ArrayList<Event>();
		  
		  try {
		            
		            FileReader fileReader = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader = new BufferedReader(fileReader);

		            while((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		                line2 = "";
		                
		                for (int x = 0; x < line.length();x++) {
                      
                      System.out.println(line2);
                      //System.out.println(line3);
                      
                      if(line2.equals("SUMMARY:") ){
                          line3 = line3 + line.charAt(x);
                          //newAL.add(line3);
                      }
                      else {
                          line2 = line2 + line.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader1 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
		            
		            //ArrayList<String> list = new ArrayList<String>();
		            
		            while((line4 = bufferedReader1.readLine()) != null) {
		                System.out.println(line4);
		                line5 = "";
		                
		                for (int x = 0; x < line4.length();x++) {
                      
                      System.out.println(line5);
                      //System.out.println(line3);
                      
                      if(line5.equals("GEO:") ){
                          line6 = line6 + line4.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line5 = line5 + line4.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader2 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader2 = new BufferedReader(fileReader1);
		            
		            while((line7 = bufferedReader2.readLine()) != null) {
		                System.out.println(line7);
		                line8 = "";
		                
		                for (int x = 0; x < line7.length();x++) {
                      
                      System.out.println(line8);
                      //System.out.println(line3);
                      
                      if(line8.equals("BEGIN:") ){
                          line9 = line9 + line7.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line8 = line8 + line7.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader3 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
		            
		            while((line10 = bufferedReader3.readLine()) != null) {
		                System.out.println(line10);
		                line11 = "";
		                
		                for (int x = 0; x < line10.length();x++) {
                      
                      System.out.println(line11);
                      //System.out.println(line3);
                      
                      if(line11.equals("PRODID:") ){
                          line12 = line12 + line10.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line11 = line11 + line10.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader4 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader4 = new BufferedReader(fileReader4);
		            
		            while((line13 = bufferedReader4.readLine()) != null) {
		                System.out.println(line13);
		                line14 = "";
		                
		                for (int x = 0; x < line13.length();x++) {
                      
                      System.out.println(line14);
                      //System.out.println(line3);
                      
                      if(line14.equals("VERSION:") ){
                          line15 = line15 + line13.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line14 = line14 + line13.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader5 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader5 = new BufferedReader(fileReader5);
		            
		            while((line16 = bufferedReader5.readLine()) != null) {
		                System.out.println(line16);
		                line17 = "";
		                
		                for (int x = 0; x < line16.length();x++) {
                      
                      System.out.println(line23);
                      //System.out.println(line3);
                      
                      if(line17.equals("CALSCALE:") ){
                          line18 = line18 + line16.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line17 = line17 + line16.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader6 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader6 = new BufferedReader(fileReader6);
		            
		            while((line19 = bufferedReader6.readLine()) != null) {
		                System.out.println(line19);
		                line20 = "";
		                
		                for (int x = 0; x < line19.length();x++) {
                      
                      System.out.println(line20);
                      //System.out.println(line3);
                      
                      if(line20.equals("DTSTART:") ){
                          line21 = line21 + line19.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line20 = line20 + line19.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader7 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader7 = new BufferedReader(fileReader7);
		            
		            while((line22 = bufferedReader7.readLine()) != null) {
		                System.out.println(line22);
		                line23 = "";
		                
		                for (int x = 0; x < line22.length();x++) {
                      
                      System.out.println(line23);
                      //System.out.println(line3);
                      
                      if(line23.equals("DTEND:") ){
                          line24 = line24 + line22.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line23 = line23 + line22.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader8 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader8 = new BufferedReader(fileReader8);
		            
		            while((line25 = bufferedReader8.readLine()) != null) {
		                System.out.println(line25);
		                line26 = "";
		                
		                for (int x = 0; x < line25.length();x++) {
                      
                      System.out.println(line26);
                      //System.out.println(line3);
                      
                      if(line26.equals("DESCRIPTION:") ){
                          line27 = line27 + line25.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line26 = line26 + line25.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            FileReader fileReader9 = new FileReader(LogFile);
		            
		            BufferedReader bufferedReader9 = new BufferedReader(fileReader9);
		            
		            while((line28 = bufferedReader9.readLine()) != null) {
		                System.out.println(line28);
		                line29 = "";
		                
		                for (int x = 0; x < line28.length();x++) {
                      
                      System.out.println(line29);
                      //System.out.println(line3);
                      
                      if(line29.equals("END:") ){
                          line30 = line30 + line28.charAt(x);
                          //list.add(line6);
                      }
                      else {
                          line29 = line29 + line28.charAt(x);
                      }
                      /*
                      if(line3.equals("GEO:") ){
                          line4 = line4 + line.charAt(x);
                      }
                      else {
                          line3 = line3 + line.charAt(x);
                      }
                      */
		                }
		                
		            }
		            
		            
		            
		            System.out.println("Summary is: " + line3);
		            //bufferedReader.close();
		            System.out.println("GEO is: " + line6);
		            System.out.println("PRODID is: " + line9);
		            bufferedReader1.close();   
		            //System.out.println(list);
		  } 
		        
		        catch(IOException ex) {
		            ex.printStackTrace();                 
		        }
	}//end of method

	

  public static void main(String[] args) { 
    getInput();
    
    /*
    Scanner s = new Scanner(new File("filepath"));
    ArrayList<String> list = new ArrayList<String>();
    while (s.hasNext()){
        list.add(s.next());
    }
    s.close();
    */
    
    //System.out.println(Arraylist.toString(list));
  }





}