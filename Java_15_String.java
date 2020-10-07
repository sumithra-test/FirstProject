package Test;

import java.util.Scanner;

public class Java_15_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string in which you find the character at the given index");
		str = sc.next();
		
		System.out.println("enter the position to get the character within the string");
		int n =sc.nextInt();
	      System.out.println("String: "+str);
	      // finding character at given  position
	      System.out.println("Character at  " + n +" position: "+str.charAt(n));
		
		
		
	}

	
	/*
	 * Assignements 1)Write a Java program to get the character at the given index
	 * within the String.  
	 */
	
	
	 
}
