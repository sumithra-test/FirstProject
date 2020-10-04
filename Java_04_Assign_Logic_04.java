package Test;

import java.util.Scanner;

public class Java_04_Assign_Logic_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner  sc = new Scanner(System.in);
		
		
		
		int a =  sc.nextInt();
		
		int b = sc.nextInt();
		
		int c;
		
		System.out.println(a +" and " + b); 
		 c= a +  b;
		System.out.println(c); 
 		 
 		 c= a * b;
 		
 	    System.out.println(c); 
 	    c = a / b;
 
      System.out.println(c);
        c = a % b;
        
        System.out.println(c);
        c = a - b; 
        
        System.out.println(c);
        c =  a++;
        
        System.out.println(c);
        
        
       if (( a > b) && (a > c)) {
    	  System.out.println("a is greater than b and c");
		
	   }
       else if ((a < b) || (a > c)) {
    	   System.out.println("a is  less than b or a is greater than c");
    	   
	   } else if ( a!=b) {
		   
		System.out.println("a is   not equal to  b ");
	   } 
    
        
	  }
 
}

//2. Take 2 number as input and perform all arithmetic/logical operation on
//that

/*
 * Arithmetic Operators Arithmetic Operators return value based Result.
 * 
 * 1) Addition + (for Addition and String concatenation)
 * 
 * 2) Subtraction - (for Subtraction and negation)
 * 
 * 3) Multiplication *
 * 
 * 4) Division /
 * 
 * 5) Modules %
 * 
 * 6) Increment ++
 */

//Logical operator
//1) Logical Not operator !
//
//2) Logical And Operator &&
//
//3) Logical Or operator ||