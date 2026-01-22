package Object_Class_Methods;

// object class methods
// 1.  HashCode();   == to generate randome number of object
// 2. equals();
// 3. getClass();    == 
// 4.  toString();   = convert  object to string  
// 5. Clone();       = creating another copy

// 6. wait();       == thread waiting state
// 7. notify();     == notify singal thread wake up
// 8. notifyAll();  == notify multiple thread wake up

class TestObject
{
	int a,b;
	
	public TestObject(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public int add() 
	{
		return(a+b);
	}
	
}


public class Test_ObjectClass_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestObject t1=new TestObject(7,15);
		
		System.out.println(t1.add());
		System.out.println(t1.add());
		
		System.out.println(t1.getClass());
		System.out.println(t1.hashCode());   // random number generate
		
		TestObject t2=new TestObject(7,15);
		System.out.println(t2.hashCode());
		
		 t2=t1;
		System.out.println(t1.equals(t2));
	}

}
