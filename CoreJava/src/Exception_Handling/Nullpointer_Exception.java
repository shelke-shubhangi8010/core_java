package Exception_Handling;

public class Nullpointer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // String a=null;
     try {
    	      String a=null;
          System.out.println("length :" +a.length());
     }
     catch(NullPointerException e)
     {
    	  System.out.println("String  value is null");
    	 
     }
	}

}
