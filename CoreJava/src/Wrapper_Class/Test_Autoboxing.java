package Wrapper_Class;
import java.lang.*;
public class Test_Autoboxing {
    // conversoin into primitive datatype into wrapper class object
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		Integer b=a;  // conversion Autoboxing
		System.out.println("b is :"+b);
		
		// next way
		
		int x=20;
		Integer y=Integer.valueOf(x);
		System.out.println("Y is :"+y);
		
	}

}
