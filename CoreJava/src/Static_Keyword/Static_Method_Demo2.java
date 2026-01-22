package Static_Keyword;

public class Static_Method_Demo2 {
	int a;
	static int b;
 
	public Static_Method_Demo2() 
	{
		
	}
	static {
		b=10;
		System.out.println("static block");
	}
	public  void show() 
	{
		System.out.println("value of :"+a);
		System.out.println("value of :"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method execute");
Static_Method_Demo2 s=new Static_Method_Demo2();
	}

}
