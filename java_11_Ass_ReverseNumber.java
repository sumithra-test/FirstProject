package Test;

import java.util.Scanner;

public class java_11_Ass_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d, number,temp, revnum = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	      temp = number;
	      while (temp >0) {
	         d = temp %10;
	         revnum = (revnum*10)+d;
	         temp = temp/10;
	      }
	      System.out.println("Reverse of the given number is:"+revnum);

	}

}


//# 8) A five-digit number is entered through the keyboard. Write aprogram to
	// obtain the reverse of thta number