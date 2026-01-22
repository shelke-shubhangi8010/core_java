package inheritance;
    // run time /dynamic/late binding
   // required inheritance
   //same method name and  same parameter 
   // use @override keyword
class Addition{
	public int add(int a,int b)
	{
		
		return a+b;	
	}
}
class TestAddition extends Addition{
	@Override
	public int add(int a,int b)
	{
		System.out.println("Calling parent class method  :"+super.add(12,20));
		return a+b;	
	}
}
class DemoAddition extends Addition{
	@Override
	public int add(int a,int b)
	{
		return a+b;	
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a;
		a=new TestAddition();
	System.out.println(	"Child class TestAddition  property : "+a.add(12, 20));
	
	
		a=new DemoAddition();
	System.out.println("Child class DemoAddition property :"	+a.add(30, 40));
		
	
	}

}
