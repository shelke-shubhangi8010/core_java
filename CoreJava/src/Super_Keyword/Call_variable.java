package Super_Keyword;

// calling instance variable
// calling parent constructor
// calling parent class method
// you can access instance variable
class parent
{
	int x=10;    // instance variable

}

class child extends parent
{
	int y=20;
	public void display()
	{
		System.out.println("Y : "+y);
		System.out.println("X : "+super.x);
	}
}
public class Call_variable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     child c=new child();
     c.display();
	}

}
