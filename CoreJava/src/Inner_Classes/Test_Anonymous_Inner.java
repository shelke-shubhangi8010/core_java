package Inner_Classes;

interface Greeting       // abstract class   you can use
{
	public void sayHello();       // abstract method you can use 

}
public class Test_Anonymous_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting greet=new Greeting()
		{
			public void sayHello() 
			{
				System.out.println("Hello from anonymous  class");
			}
			
			
		};		
				
			greet.sayHello();	
		
		
		
		
	}

}
