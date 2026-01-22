package Super_Keyword;

//calling instance variable
//calling parent constructor
//calling parent class method
//you can access instance variable
class Animal
{
	public void show()     // call parent class method using super keyword
	{
		System.out.println("this is parent class property");
		
	}
}

class Dogs extends Animal
{
	public void display() 
	{
		super.show();  // parent method calling using super keyword
		System.out.println("this is child property");
	}
}
public class Call_Parent_Method 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Dogs t= new Dogs();
     t.display();
	}
}

