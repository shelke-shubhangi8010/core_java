package inheritance;
class Demo{

public int add(int a,int b)		
{
	return a+b;
}

public int add(int a,int b,int c)
{
	return a+b+c;
}

public float add(float a,float b)
{
	return a+b;
}
public double add(double a,double b)
{
	return a+b;
}
}

public class Demo_Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Demo c = new Demo();
		
	 int res=   c.add(10,20);
		int res1=c.add(10,20,30);
		float res2=c.add(26.8f,35.3f);
		double res3=c.add(23.345656,34.896745);
		
		System.out.println("1st method:"+res);
		System.out.println("2st method:"+res1);
		System.out.println("3st method:"+res2);
		System.out.println("4st method:"+res3);
	}

}
