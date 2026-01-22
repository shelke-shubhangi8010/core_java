package Final_keyword;
final class A
{
	public void print()
	{
		System.out.println("final  class method");
		
	}
}
// don't inherit it
public class final_class //extends A
{
	public void print1()
	{
		System.out.println(" child final  class method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_class t=new final_class();
		t.print1();
	}

}
