package Abstraction;

// abstract method declare in abstract keyword
// in achived abstraction in 0-100%
// it used to code reusability
// is showing functionality in hiding details/complex information
//100% abstraction in interface 
//0-100% abstraction in use abstract class

//Abstract class   ==
            // a class declare in abstract keyword and it contain abstract and non abstract method
// abstract method  =  non body method
// non abstract method =  with body method

// abstract class  can not be instanciated
// it can also contain constructor ,final method,static method
// abstract method must be overridden
abstract class bike
{
	abstract void run();
  abstract void show();
}
class Bajaj extends bike
{
	void run() 
	{
		System.out.println("Bike is running");
	}
    void show() 
    {
    	System.out.println("show method");
    }
}
public class Method_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bike b=new Bajaj();
b.run();
b.show();
	}

}
