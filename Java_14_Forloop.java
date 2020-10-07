package Test;

import java.util.Scanner;

public class Java_14_Forloop {

	public static void main(String[] args) {
		
		
		// intialize and declaring the objects.
        int n,positive=0, negative=0, zero=0, i;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);
       
        // enter number you have to enter.
        System.out.print("How many Number you want to Enter : ");
        n = scan.nextInt();
		
        // enter the numbers.
        System.out.println("Enter " +n+ " Numbers : ");
      
        // this is to calculate the type of the number.
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(arr[i] < 0)
            {
                negative++;
            }
            else if(arr[i] == 0)
            {
                zero++;
            }
            else
            {
                positive++;
            }
        }
		// print all +ve,-ve and zero number.
        System.out.print("Positive Numbers are: " + positive );
        System.out.print("\nNegative Numbers are: " + negative );
        System.out.print("\nZeros are: " + zero );
		
		
	/*	Scanner scan=new Scanner(System.in); 
        char opt='Y'; 
        int counter=0,nve=0,pve=0,zero=0,num; 
        while(opt=='y'||opt=='Y') 
        { 
            ++counter; 
            System.out.println("Enter the number: "); 
            num=scan.nextInt(); 
            if(num==0) 
                ++zero; 
            else if(num>0) 
                ++pve; 
            else if(num<0) 
                ++nve; 
            System.out.println("Enter 'Y' if you wish to continue else enter 'N'!"); 
            opt=scan.next().charAt(0); 
        } 
        System.out.println("Total Number Of Entries: "+counter); 
        System.out.println("Negative Entries: "+nve); 
        System.out.println("Positive Entries: "+pve); 
        System.out.println("Zero Entries: "+zero); 
        scan.close(); 
        
        */
		// TODO Auto-generated method stub
/*
		int countp=0, countn=0, countz=0, i;
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter 10 Numbers : ");
        for(i=0; i<10; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<10; i++)
        {
            if(arr[i] < 0)
            {
                countn++;
            }
            else if(arr[i] == 0)
            {
                countz++;
            }
            else
            {
                countp++;
            }
        }
		
        System.out.print(countp + " Positive Numbers");
        System.out.print("\n" + countn + " Negative Numbers");
        System.out.print("\n" + countz + " Zero");
		
		*/
		
		
		
		
	}

	
	
	
	
	 
	// # 3) Write a program to enter the numbers till the user wants and
	// # at the end it should display the count of positive, negative and
	// # zeros entered.

}
