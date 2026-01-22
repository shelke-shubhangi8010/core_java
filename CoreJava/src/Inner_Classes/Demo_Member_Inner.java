package Inner_Classes;
class Action{   // outer class
	
	private   String name="riya";
	                                  // 
	    public void display() 
	   {
		    System.out.println("Name is :"+name);
	   }
	
	     class Test      // inner class
	     {
		     public void print() 
		     {
		    	   System.out.println("Name is inner class :"+name);
		     }
	     }
	
}
public class Demo_Member_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Action a=new Action();
		 a.display();
		 
		 // upcasting
		 Action.Test r= a.new Test();
		 r.print();
	}

}
