package Test;

import java.util.Scanner;

public class java_10_Ass_leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	}

}

//# 6) Any year is input through the keyboard. Write a program to determine
	// whether the year is a leap year or not.
//# (Hint: Use the % (modulus) operator)
