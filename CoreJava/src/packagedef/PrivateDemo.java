package packagedef;

public class PrivateDemo {
private int  n=10; 

private void printDetails()   // same package accessible   == class  
{
	System.out.println("private method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   PrivateDemo p= new PrivateDemo();
   System.out.println(p.n);
   p.printDetails();
	}

}
