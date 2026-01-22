package Interface;
interface Myinterface1
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
class PrivateInterfaceDemo implements Myinterface1
{
	public void name() 
	{
		System.out.println("child method");
	}

}

public class private_interfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateInterfaceDemo p=new PrivateInterfaceDemo();
		p.display();
		p.show();
		p.name();
	}

}
