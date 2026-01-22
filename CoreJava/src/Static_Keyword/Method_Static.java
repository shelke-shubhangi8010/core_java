package Static_Keyword;
class staticDemo
{ 
	// static method reference the class for calling method
	//refer the class name
	public static void show()  //
	{
		System.out.println("show method");
	}

}
public class Method_Static {
     // static method  no need object creation
	public static void display() 
	{
      System.out.println("static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      display();
    staticDemo . show();
	}

}
