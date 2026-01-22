package Wrapper_Class;

public class Test_UnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// conversion into wrapper class object to primitive data type
		
		Double d1= 50.00;// wrapper class object
		double d= d1;    // converting primitive data type
		System.out.println("d is :"+d);
		
		// Alternate way
		Double d2= 60.00;
		double obj = d2.doubleValue();
		System.out.println("object is :"+obj);
		
		float f=12;
		Float f1=f;  // wrapper class object
		
		float f3=f1;
		
		System.out.println("object is : "+f3);
		float f4=f1.floatValue();
		
		System.out.println("object is :"+f4);
	}

}
