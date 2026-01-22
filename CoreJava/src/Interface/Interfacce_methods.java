package Interface;

// it is used to achieve  multiple inheritance,hybrid inheritance
// static,constant,abstract method
//  used to 100% abstraction in java
// interface method is by default abstract


interface MyInterface
{
	static void teststatic() 
	{
		System.out.println("Static methods calls");
	}
	private void testprivate() 
	{
		System.out.println("private methods calls");
	}
	default void testdefault() 
	{
		testprivate();
		System.out.println("Default methods calls");
	}
      public void display();
}

class Myclass implements MyInterface
{
	public void display() 
	{
		System.out.println("display method calls");
	}


}
public class Interfacce_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface. teststatic();   // static method call using interface no need object
    MyInterface m=new Myclass();
    m.display();
    m.testdefault();
  
	}

}
