package inheritance;
class vehical            //Singal Inheritance
{
	public void Start() 
	{	
		System.out.println("Start the Vehical");
	}
}
class car extends vehical
{
	public void Drive()
	{
		System.out.println("car is Driving");	
	}
}
public class Demo_Singal_Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 =new car();
		c1.Start();
		c1.Drive();
	}
}
