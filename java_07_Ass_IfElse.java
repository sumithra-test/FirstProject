
 

package Test;

import java.util.Scanner;

public class java_07_Ass_IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter Martial status: ");
		 String martialStatus = input.next();
		 // System.out.println("Status is :" + martialStatus == "Married");
		 System.out.print("Enter sex: ");
		 String sex = input.next();
		 System.out.print("Enter age: ");
		 int age = input.nextInt();
		 if (martialStatus.equals("Married")) {
		 System.out.println("You are insured");
		 } else if (sex.equals("male") && age > 30) {
		 System.out.println("insured");
		 } else if (sex.equals("female") && age > 25) {
		 System.out.println("insured");
		 } else {
		 System.out.println("Not insured");

	}

}
}


//# 3) A company insures its drivers in the following cases:
//# If the driver is married.
//# If the driver is unmarried, male & above 30 years of age.(
//martialstatus==unmarid && age>30, sex==male)
//# If the driver is unmarried, female & above 25 years of age.
//# In all other cases the driver is not insured. If the marital status, sex
//and age of the driver are the inputs, write a program to determine
//# whether the driver is to be insured or not.
