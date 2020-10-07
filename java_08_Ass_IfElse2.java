
 // # 4) If cost price and selling price of an item is input through the
	// keyboard, write a program to determine whether the seller has
	// # made profit or incurred loss. Also determine how much profit he made or
	// loss he incurred.
	
	
	
	

package Test;

import java.util.Scanner;

public class java_08_Ass_IfElse2 {

	public static void main(String[] args) {
		 Scanner sc;
		float saleAmount, costPrice;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Actual Product Cost : ");
		costPrice = sc.nextFloat();	
		
		System.out.print(" Please Enter the Selling Price (Market Price) : ");
		saleAmount = sc.nextFloat();
		
		profitOrloss(saleAmount, costPrice);
	}
	
	public static void profitOrloss(float saleAmount, float costPrice)
	{
		float amount;
		
		if(saleAmount > costPrice )
		{
			amount = saleAmount - costPrice;
			System.out.println("\n Profit Amount =  " + amount);
		}
		else if(costPrice > saleAmount)
		{
			amount = costPrice - saleAmount;
			System.out.println("\n Loss Amount =  " + amount);
		}
		else
		{
			System.out.println("\n No Profit No Loss! ");
		}	
	}

}
