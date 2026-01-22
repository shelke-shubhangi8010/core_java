package Wrapper_Class;

public class Test_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n= "2345";
		// use wrapper class
		int a=Integer.parseInt(n);// converting string to integer
		System.out.println(a);
		
		
		
		int x=10;
		String s= Integer.toString(x); // converting integer to string
		System.out.println(s);
		
		double d= Double.parseDouble(s); // 
		System.out.println(d);
		
	}

}
