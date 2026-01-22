package Exception_Handling;

public class Nested_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Thank You");
    try 
    {
    	     int a[] =new int[5];
    	    try 
    	    {
    	    	a[7]=30/5;
    	    }
    	    catch(ArithmeticException e) 
    	    {
    	    	   System.out.println(e);
    	    	   System.out.println("can not divisible by zero");
    	    }
    	    
    	        String n=  null;
			System.out.println(n.length());
    
    }catch(Exception e)
    {
    	   System.out.println(e);
    }
	}

}
