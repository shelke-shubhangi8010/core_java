package inheritance;

interface phone
{
	public void makecall();     //non body method	
}                                  // public method not allow the  interface
interface Internate             // default ,static private method is aallow the body
{
	public void browse();
}

class SmartPhone implements phone,Internate
{
	public void makecall() 
	{
		System.out.println("making a call");
	}
	public void browse()
	{
		System.out.println("Browsing the internate");
	}
}

public class Multipal_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone sp=new SmartPhone();
		sp.makecall();
		sp.browse();
		
	}

}
