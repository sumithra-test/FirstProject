package Test;

import java.util.Scanner;

public class Java_05_Ass_ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter joining date");
		
		int joining =  sc.nextInt();
		
		System.out.println("joining date is "+ joining);
		
		System.out.println("enter current date  ");
		int current = sc.nextInt();
		
		System.out.println(" current  date is "+ current);
		
		if ( (current-joining) > 3) {
			System.out.println("bonus is given to the employee 2500");
		}  

	}
	
	// ======================
	/*
	 * #Assignment 1 1)The current year and the year in which the employee joined
	 * the organization are entered through the keyboard. If the number of years for
	 * which the employee has # served the organization is greater than 3 then a
	 * bonus of Rs. 2500/- is given to the employee. If the years of service are not
	 * greater than 3, then the program should do nothing.
	 */

	
	//
	

	

	// ===============================

}
