package inheritance;

class Device
{
	public void turnon()
	{
		System.out.println("Device is turnon");
	}
}
class Phone extends Device
{
	public void call()
	{
		System.out.println("Phone is calling");
	}
}
class Laptop extends Device       //  extend has a same parent class
{
	public  void Compile()
	{
		System.out.println("Laptop is compiling code");
	}

}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Phone p=new Phone();
		p.call();
		p.turnon();
		
	 Laptop lp=new Laptop();
		lp.Compile();
		
	}

}
//-----task----//

//create a vehical bike car class define is singling relationship

//car  es  vehical
//bike  extend  vehical
