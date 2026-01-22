package Interface;
interface Myinterface
{
	default void show() 
	{
		System.out.println("show method");
	}
	default void display()
	{
		Printable();
		System.out.println(" display  method");
	}

    private void Printable() 
    {
    	System.out.println("Private method");
    }
}
class PrivateInterface implements Myinterface
{
	public void name() 
	{
		System.out.println("child method");
	}

}

public class Test_Private_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateInterface p=new PrivateInterface();
		p.display();
		p.show();
		p.name();
	}

}
