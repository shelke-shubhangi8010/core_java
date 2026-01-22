package Practice_Example_Oops_Concept;
interface symsung
{
	public void Airtel();
}
interface Vivo
{
	 public void jio();
}
class mobile implements symsung,Vivo
{
	public void Airtel()   // interface implementation in method
	{
		System.out.println("this is airtel sim");
	}

    public  void jio()    //  interface implementation in method
    {
    	System.out.println("This is jio sim");
    }
    public void Brand()     // this is class method
    {
    	System.out.println("This is mobile brand");
    }
}
public class Multipal_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      mobile m=new mobile();
      m.Airtel();
      m.jio();
      m.Brand();
	}

}
