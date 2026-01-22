package inheritance;

interface Printable
{
	public void Print();  // abstract method
}
interface Scannable       //  parent 
{
	public void Scan();
}

class Machine    //  child class
{
	public void powerOn() 
	{
		System.out.println("Machine is power on");
	}
}
      // combination with inheritance & interface
class Printer extends Machine implements Printable,Scannable     
{
	public void Print() 
	{
		System.out.println("printing document");
	}
	public void Scan()
	{
		System.out.println("Scanning document");
	}
	 public void status()
	{
		System.out.println("printer is ready");
	}
	
}
public class Hybrid_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer print=new Printer();
		print.Print();
		print.Scan();
		print.status();
	}

}
