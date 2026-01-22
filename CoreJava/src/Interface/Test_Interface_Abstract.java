package Interface;
interface Shape
{
	public void draw();
	public void Display();
	
	 default  void run () 
	 {
		 System.out.println("run method");
	 }
		 
	 
}

class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
     public void Display()
     {
    	 System.out.println("show circle");
     }
     
     public void square() 
     {
    	   System.out.println("default method");
     }
}
public class Test_Interface_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s= new Circle();     // reference variable
		// Circie c=new Circle();
		s.draw();
		s.Display();
		s.run();
		
		Circle  c= new Circle();
		c.square();
	}

}
