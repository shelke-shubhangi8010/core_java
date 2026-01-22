package Inner_Classes;
class Outer
{
	 public void Test() 
	 {
		 System.out.println("Test method");
		 
		 class Inner
		 {
			 public void Demo() 
			 {
				 System.out.println("Demo Method");
			 }
			 
		 }
		 Inner a=new Inner();
		 a.Demo();
	 }
}
public class local_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer ob=new Outer();
		ob.Test();
		
	/*	A.Inner in = ob.new Inner();
		in.Demo();   */
		
	}

}
