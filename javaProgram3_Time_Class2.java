package test;


class Time

{
	 int hour; 
	 int minute; 
	 int second; 
	 
	 Time(int h, int m , int s) { 
   	  System.out.println("iam inside the constructor");
   	    hour=h;  
   	   minute = m;
       second=s;  
   }  
	 
	 public int getHour() {
	        return hour;
	      }
	 
	 public int getMinute() {
	        return minute;
	      }
	 
	 public int getSecond() {
	        return second;
	      }
	 
	 void setHour( int h1) {
		   hour =h1;
	  
	  }
	 void setMinute( int  m1) {
		   minute =m1;
	  
	  }
	 void setSecond( int s1) {
		   second = s1;
	  
	  }
	 
	Time nextSecond( ) {
		return null;
		  
	  
	  }
	 Time previousSecond( ) {
		return null;
		  
	  
	  }
	 @Override
	    public String toString() { 
	        return String.format( " time is  :" + hour +" "+minute +" "+ second ); 
	    } 

}


public class javaProgram3_Time_Class2 {

	public static void main(String[] args) {
		 Time t1 = new Time(22, 02, 02);
		 
		 System.out.println(t1.toString());
		 t1.setHour(11);
		  t1.setMinute(12);
		  t1.setSecond(30);
		  
		  System.out.println("hour is :"+t1.getHour());
		  System.out.println("minute is :"+t1.getMinute() );
		  System.out.println("second is :"+t1.getSecond() );
		  
		  System.out.println(t1.toString());
		  
		  
		  
	}

}
