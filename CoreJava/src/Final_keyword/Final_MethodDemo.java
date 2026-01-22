package Final_keyword;

class FinalTest
{
	final void display()
	{
	    System.out.println("final method");
	}

}

public class Final_MethodDemo  //extends FinalTest
{
    public void display()
    {  
    	System.out.println("child class final method");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalTest f= new FinalTest();
    f.display();
   // display();
    Final_MethodDemo t=new Final_MethodDemo();
    t.display();
	}

	
}
