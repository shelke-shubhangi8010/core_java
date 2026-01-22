package Practice_Example_Oops_Concept;

class parent
{
	public void show() 
	{
		System.out.println("This is parent property");
	}
}
class son1 extends parent
{
	public void girl()
	{
		System.out.println("this is son1 property");
	}
}
class son2 extends parent
{
	public void son() 
	{
		System.out.println("this is son2 property");
	}
}

public class Hierarichical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     son2 s=new son2();
     s.son();
     s.show();
 
	}

}
