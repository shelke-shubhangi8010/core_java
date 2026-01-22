package oopsConcept;

public class ConstructorDemo {
      /// constructor does not except return type
      ///special type of method in class
      ///no-arg constructor
      ///access modifier   to control the object   ==public private
      /// constructor use object initalize
      ///when you create the object after calling constructor
	public ConstructorDemo()         // constructor
	{
		System.out.println("calling constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo   c=new  ConstructorDemo();
		ConstructorDemo   c1=new  ConstructorDemo();
		ConstructorDemo   c2=new  ConstructorDemo();
	}

}
