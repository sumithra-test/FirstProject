package test;


class Circle
{
	
	
	double radius1;
	
	String Color1;
	
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius1 =1.0;
		Color1 = "red";
		
	}
	public Circle(double radius) {
		radius1 = radius;
		 
	}
	
	public Circle(double radius, String Color) {
		radius1 = radius;
		Color1 = Color;
		 
	}
	public double getradius() {
        return radius1;
      }
    public String getColor() {
        return Color1;
      }
    
    public double getArea() {
        return (22*radius1*radius1)/7;
      }
    
    
    void setRadius( double radius) {
  	 radius1=radius;
    
    }
    void setColor(String color) {
     	 Color1 = color;
       
       }
    
    @Override
    public String toString() { 
        return String.format( "circle  details are :" + radius1 +" "+ Color1 ); 
    } 

}


public class javaProgram1_Circle_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir= new Circle();
		System.out.println(cir.toString());
		cir.setColor("blue");
		cir.setRadius(2.0);
		
		System.out.println(" radius of the circle is :"+ cir.getradius());
		System.out.println("color of the circle is :"+cir.getColor());
		System.out.println("area of the circle is "+cir.getArea());
		
		System.out.println("************");
		Circle c1 = new Circle(1.0, "red");
		 
		System.out.println(c1.toString());
	}

}
