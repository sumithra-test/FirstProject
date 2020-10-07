// # 2) The marks obtained by a student in 5 different subjects are input
	// through the keyboard. The student gets a
	// # division as per the following rules: Percentage above or equal to 60 -
	// First division
	// # Percentage between 50 and 59 - Second division
	// # Percentage between 40 and 49 - Third division
	// # Percentage less than 40 - Fail
	// # Write a program to calculate the division obtained by the student
package Test;

import java.util.Scanner;

public class java_06_ifElse {
 	public static void main(String[] args) {
		float percentage;
	    float total_marks;
	    float scored ,firstSub,secSub,thirdSub,fourthSub,fifthSubject;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter your first subject marks :");
	     firstSub= sc.nextFloat();
	    
	    System.out.println("Enter your second subject marks :");
	    secSub = sc.nextFloat();
	    
	    System.out.println("Enter your third subject marks :");
	     thirdSub = sc.nextFloat();
	    
	    System.out.println("Enter your fourth subject marks :");
	     fourthSub = sc.nextFloat();
	    
	    System.out.println("Enter your fifth subject marks :");
	     fifthSubject = sc.nextFloat();

	    System.out.println("Enter total marks ::");
	    total_marks = sc.nextFloat();
	    
	    scored = firstSub+secSub+thirdSub+fourthSub+fifthSubject;

	    percentage = (float)((scored / total_marks) * 100);
	    System.out.println("Percentage ::"+ percentage);
 
	    if(percentage>=60) {
	    	    System.out.println("student secured first division");
	    	}else if(( percentage < 59) && (percentage >50)) {
	    		 System.out.println("student secured second division");
	 }else if( (percentage < 49) && (percentage> 40)) {
	    	    System.out.println("student secured third division");
	    	}else {
	    	   System.out.println("fail");
	    	}
	    
	}
	
	
	
}
