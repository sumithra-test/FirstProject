package Test;

import java.util.Scanner;

public class Java_19_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String str1 =  sc.next();
		
		System.out.println("enter second string");
				
        String str2 = sc.next();

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);


        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
        System.out.println("The concatenated string: " + str3);
		
		
		
	}

	
	/*
	 *  . 5) Write a Java
	 * program to concatenate a given string to the end of another string.  
	 */
	
	
	 
}
