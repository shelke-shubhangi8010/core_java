package Block;


public class Static_Block {
    
	static     // static block
	{          // first execute static block then main()
		       // use static variable assign data to use  static block
		System.out.println("hello from static block");
		//static int age =10;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello from main method");
		Static_Block s= new Static_Block() ;
	}

}
