package Test;

import java.util.Arrays;
import java.util.Collections;

public class Java_32_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Let us create an array of integers 
        Integer arr[] = {10, 20, 30, 40, 50}; 
  
        System.out.println("Original Array : " + 
                                Arrays.toString(arr)); 
          
        // Please refer below post for details of asList() 
        
        Collections.reverse(Arrays.asList(arr)); 
          
        System.out.println("Modified Array : " + 
                                Arrays.toString(arr)); 
		
		
		
	}

	 
	// Write a Java program to reverse an array of integer values
	//
	 

	
}
