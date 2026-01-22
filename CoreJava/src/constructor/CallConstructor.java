package constructor;

class ConstructorcallTest
{
	public ConstructorcallTest()      // default constructor
	{
		System.out.println("default constructor");
	}

	public ConstructorcallTest(int id)    // parametarize constructor
	{
		
		this();          // 
		
		System.out.println("parametarize constructor" +id);
	}
}

public class CallConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorcallTest t=new ConstructorcallTest(30);
	}

}
