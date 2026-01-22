package Inner_Classes;
class Ready
{
	public Ready() 
	{
		System.out.println("Outer class Constructor");
		
		class Start 
		{
			public void show() 
			{
				System.out.println(" local inner class");
			}
		}
		Start s=new Start();
		s.show();	
	}
}
public class Constructor_Local_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Ready r=new Ready();
   
	}

}
