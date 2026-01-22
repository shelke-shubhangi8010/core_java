package oopsConcept;

class Student
{
	static void name() {
		
		System.out.println("This is student class");
	}
}
public class DemoClass {

	public static void display()      //method
	{
		
		
		System.out.println("This is userdefine method");
	}
	static void goout() {        // static method 
		                           // no need object creation
		System.out.println("This is static method");
	}
	
	
	public static void main(String[] args) {     // main method
		// TODO Auto-generated method stub

		DemoClass d= new DemoClass();   // object creation
		
		d.display();              //calling method
		
		Student.name();    // reference through the class calling  static method
		
	}

}
