package test;

class Employee{  
    int id;  
    String firstName;  
    String lastName;  
    int salary;  
    
    Employee()
    {
    	
    }
      Employee(int i, String fn, String ln, int sal) { 
    	  System.out.println("iam inside the constructor");
        id=i;  
        firstName = fn;
        lastName=ln; 
        salary=sal;  
    }  
    public int getId() {
        return id;
      }
    public String getFirstName() {
        return firstName;
      }
    public String getLastName() {
        return lastName;
      }
    public String getName() {
        return firstName+lastName;
      }
    public int getSalary() {
        return salary;
      }
    public int getAnnualSalary() {
        return salary*12;
      }
 // // sets dimensions of employee
    void setSalary( int salary) {
	  salary = salary;
  
  }
    int raiseSalary( int percent) {
  	 int newIncrease= (salary *percent)/100 ;
  	return salary =salary+newIncrease;
     //still to write the code
    }
    
    @Override
    public String toString() { 
        return String.format( "employee details are :" + id +" "+firstName +" "+ lastName+ " "+ salary); 
    } 
    
}
    
     
public class javaProgram4_Employee_Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new  Employee(1, "covid", "pandemic", 1000);
		
		System.out.println("employee id is  : "+e1.getId());
		System.out.println("employee first name  is  : "+e1.getFirstName());
		System.out.println("employee last name  is  : "+e1.getLastName());
		System.out.println("employee    name  is  : "+e1.getName());
		System.out.println("employee salary  is  : "+e1.getSalary());
		System.out.println("employee  Annual salary   is  : "+e1.getAnnualSalary());
		e1.salary = 2000;
		
		System.out.println("employee salary raised by : "+e1.raiseSalary(10));
		
		System.out.println("employee complete details are :" +e1.toString());
	     
	}

}

 