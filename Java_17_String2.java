package Test;

import java.util.Scanner;

public class Java_17_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string ");
		String str =  sc.next();
	      int count = 0;
	      System.out.println("String: "+str);
	      for (int i = 0; i < str.length(); i++) {
	         if (Character.isLetter(str.charAt(i)))
	         count++;
	      }
	      System.out.println("Letters: "+count);
		
		
	}

	
	/*
	   3) Write a java program to count a character of a
	 * String.  
	 */
	
	
	 
}
