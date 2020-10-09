package test;
class Rectangle
{
	
	
	float length;
	
	float width;
	
	Rectangle()
	{

		length = 1.0f;
		width = 1.0f;
		
	}
	
	Rectangle(float len ,float wid )
	{
		length = len;
		width = wid;
		
	}
	public float getLength() {
        return length;
      }
    public float getWidth() {
        return width;
      }
    
    
    void setRadius( float l) {
  	 length =l;
    
    }
    void setColor(float w) {
     	  
       width = w;
       }
    public double getArea() {
        return  length*width; 
      }
    
    @Override
    public String toString() { 
        return String.format( "Rectangle  details are :" + length+" "+ width ); 
    } 
}
public class javaProgram2_RectangleClass2 {

	public static void main(String[] args) {
		 
		Rectangle r = new Rectangle();
		
		System.out.println(r.toString());
		
		
		System.out.println("length of the rectangle"+r.getLength());
		System.out.println("width of the rectangle is "+r.getWidth());
		System.out.println("area of the rectangle is "+r.getArea());
		
		Rectangle r1= new Rectangle(12, 10);
		

		System.out.println(r1.toString());
		
		
		System.out.println("length of the rectangle"+r1.getLength());
		System.out.println("width of the rectangle is "+r1.getWidth());
		System.out.println("area of the rectangle is "+r1.getArea());
		
	}

}
