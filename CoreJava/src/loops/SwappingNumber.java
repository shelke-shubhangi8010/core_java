package loops;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=10;
 int b=20;
 int temp=a;
 a=b;
 b=temp;
 System.out.println("Using 3rd Variable");
 
 System.out.println("After Swapping value of a  =" +a);
 
 System.out.println("After Swapping value of b  =" +b);
 
		
 System.out.println();
 System.out.println("with out using 3rd variable" );
 
	a=a+b;	
	b=a-b;	
	a=a-b;
	System.out.println("After Swapping value of a" +a);
	System.out.println("After Swapping value of b" +b);
	 
	}

}
