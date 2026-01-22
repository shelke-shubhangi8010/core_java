package Super_Keyword;

//calling instance variable
//calling parent constructor
//calling parent class method
//you can access instance variable
// calling parametrise constructor

class Vehical
{
	public Vehical(int a) 
	{
		System.out.println(" parent class constructor");
		System.out.println(a);
	}
}
class Car extends Vehical
{
	public Car() 
	{
		super(10);   // calling parametrise constructor
		System.out.println("child class Constructor ");
	}

}
public class Call_Parent_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car c=new Car();

	}

}
