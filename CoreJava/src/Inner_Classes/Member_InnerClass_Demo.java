package Inner_Classes;
class OuterClass
{
	int x=100;    // outer class variable

      class InnerClass
      {
    	     public void InnerMethod() 
    	     {
    	    	    System.out.println("value from outer class :" + x);
    	     }
    	  
      }
}
public class Member_InnerClass_Demo {

	public static void main(String[] args) {
		
         // outer class object creation
		OuterClass o = new OuterClass();
		
		// Upcasting 
		OuterClass .InnerClass inner = o.new InnerClass();
		inner.InnerMethod();
	}

}
