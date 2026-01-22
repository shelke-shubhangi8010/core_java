package constructor;

class CallParameterMethod
{
	public void display(int b) 
	{
		System.out.println("Hello from display" +b);
		
	}
     public void show(int a) 
     {
    	     this.display(a);               //  this keyword use to calling  a method 
    	 System.out.println("Hello from show"  +a);
     }
}


public class CallParameterizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallParameterMethod   C=new   CallParameterMethod();
		C.show(10);
		
		CallParameterMethod   C1=new   CallParameterMethod();
		C1.show(20);
		
		
	}

}
