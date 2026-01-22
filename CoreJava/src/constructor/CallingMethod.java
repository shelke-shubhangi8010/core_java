package constructor;

class CallMethod
{
	public void display() {
		System.out.println("Hello fron display");
		
	}
     public void show() 
     {
    	     this.display();       //  this keyword use to calling  a method 
    	 System.out.println("Hello from show");
     }
}
public class CallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CallMethod c=new CallMethod();
     c.show();
	}

}
