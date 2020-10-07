package Test;

import java.util.Scanner;

public class Java_12_Forloop {

	public static void main(String[] args) {
		
		 int i =1, factorial=1, number;
	      System.out.println("Enter the number to which you need to find the factorial:");
	      Scanner sc = new Scanner(System.in);
	      number = sc.nextInt();

	      while(i <=number) {
	         factorial = factorial * i;
	         i++;
	      }
	      System.out.println("Factorial of the given number is:: "+factorial);
	   
		
	}

	
	
	
	
	// # ***********For loop**********
	// # 1) Write a program to find the factorial value of any number entered
	// through the keyboard.
	
	 
}
/* TODO Auto-generated method stub
int n,fact=1;
Scanner input = new Scanner(System.in);

System.out.println("enter the number ");
 n= input.nextInt();

 
for(int i=1;i<=n;i++)
{

   fact=fact*i;
	  }

    System.out.println("factoraial of a given number "+ n +"="+fact);
*/