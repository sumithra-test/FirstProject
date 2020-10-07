package Test;

import com.sun.jdi.Method;

public class Java_28_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int n = arr.length;
	     
	    // Function that return average of an array. 
	    
        System.out.println("average of all elements in the array is "+average(arr, n));
        
            
        
	}
	public static int average(int a[], int n) {
		
		  
        // Find sum of array element 
        int sum = 0; 
          
        for (int i = 0; i < n; i++) 
        {
            sum += a[i]; 
        }
        System.out.println("sum is "+sum);
        return sum / n; 
		
	}
	 
	// Write a Java program to calculate the average value of array elements.
	//
	 
	
}
