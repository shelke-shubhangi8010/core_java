package Exception_Handling;
class NegativeNumberException extends Exception
{
	public NegativeNumberException(String msg) 
	{
		super(msg);
	}
}
public class cus_Exception_negativeNo {
      static void cheakNo(int no) throws   NegativeNumberException
      {
    	     if(no<0) 
    	     {
    	    	   throw new NegativeNumberException("no must be greaterthan zero");
    	     }
    	     else
    	     {
    	    	       System.out.println("valid no :"+no);
    	     }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	cheakNo(-1);
}
catch(Exception e) 
{
	System.out.println(e);
}
}
	}


