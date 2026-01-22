package Final_keyword;


// final method do not inherit
final class MathOperation 
{
	static int add(int a,int b) 
	{
		return a+b;
	}

	static int sub(int a,int b) 
	{
		return a-b;
	}
}
public class Demo_Final_Class //extends MathOperation
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation  m= new MathOperation ();
		System.out.println(m.add(10, 20));
		System.out.println(m.sub(10, 20));
	}

}
