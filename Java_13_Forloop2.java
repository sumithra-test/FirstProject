package Test;

import java.util.Scanner;

public class Java_13_Forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the base number ::");
	      int base = sc.nextInt();
	      int temp = base;
	      System.out.println("Enter the exponent number ::");
	      int exp = sc.nextInt();

	      for (int i=1; i<exp; i++){
	         temp = temp*temp;
	      }
	      System.out.println("Result of "+base+" power "+exp+" is "+temp);
		
		
		
	}

	
	
	
	
	 
	// # 2) Two numbers are entered through the keyboard. Write a program to find
	// the value of one number raised to the power
	// # of another.
	 
}
