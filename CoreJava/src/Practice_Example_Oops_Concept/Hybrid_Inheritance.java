package Practice_Example_Oops_Concept;
interface parent1
{
	public void girl();   // abstract method
}
interface child
{
	public void boy();    // abstract method
}
class brother{
	public void show() 
	{
		System.out.println("son1 property");
	}
}
class Grandfather extends brother implements parent1,child
{
	public void girl()
	{
		System.out.println("this is girl property");
	}
	
	public void boy() 
	{
		System.out.println("This is boys property");
	}
	public void name() 
	{
		System.out.println("my grandfather name is ........");
	}
}
public class Hybrid_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandfather g=new Grandfather();
		g.boy();
		g.girl();
		g.name();
		g.show();
	}

}
