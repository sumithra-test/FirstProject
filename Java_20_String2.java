package Test;

public class Java_20_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = " covid pandemic 2020", str2 = "universe";
		   
	      CharSequence cs1 = "pan";
	    
	      // string contains the specified sequence of char values
	      boolean retval = str1.contains(cs1);
	      System.out.println(" first string contains the sequnece of "+ cs1 +  " " +   retval);
	    
	      // string does not contain the specified sequence of char value
	      retval = str2.contains("_");   
	      System.out.println(" second string contains the sequnece  " + retval);
		
		
		
	}

	
	/*
	 *  6) Write
	 * a Java program to test if a given string contains the specified sequence of
	 * char values.  
	 */
	
	
	 
}
