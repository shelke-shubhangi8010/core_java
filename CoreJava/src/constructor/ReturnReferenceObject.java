package constructor;

///


class A
{
	A getA()      // class name return type
	{
		return this;
	}
	public void message()
	{
		System.out.println("welcome to java");
		
	}
}
public class ReturnReferenceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// calling class without object
		new A().getA().message();   //returning object
	}

}
