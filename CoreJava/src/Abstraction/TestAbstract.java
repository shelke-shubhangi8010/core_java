package Abstraction;
abstract class Vahical
{
	abstract void run();
	abstract void show();   // abstract method
	public void name()     // non abstract  method
	{
		System.out.println("non abstract method");
	}
}
class car extends Vahical
{
	public void run()
	{
		System.out.println("Bike is running");
	}
	public void show() 
	{
		System.out.println("show mathod");
	}
}
public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vahical v=new car();   // reference variable
       v.run();
       v.show();
       v.name();
	}

}
