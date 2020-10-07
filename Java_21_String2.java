package Test;

import java.util.Scanner;

public class Java_21_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //declare the String object
	    String str = "Hello find out my length";
	    
	    //length() method of String returns the length of a String.
	    int length = str.length();
	    System.out.println("Length of first String is : " + length);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		String givenString =sc.nextLine();
		
//		
//	    String Str1 = new String("Hello find out my length");
//	      String Str2 = new String("Hello find out my length" );
//
//	      System.out.print("String Length :" );
//	      System.out.println(Str1.length());
//
//	      System.out.print("String Length :" );
//	      System.out.println(Str2.length());
		System.out.println("entered string is :" +givenString);
	      
	      System.out.print("given String Length :" );
	      System.out.println(givenString.length());
	}

	
	/*
	 *  . 7) Write a java program to get the length of a given string.
	  
	 */
	
	
	 
}
