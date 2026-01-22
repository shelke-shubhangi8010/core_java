package Exception_Handling;
// custom Exception means own exception 
// self Exception extends in predefine Exception class
// in exception handling use in super keyword access in parent class property
class ShubhangiException extends Exception
{
	public  ShubhangiException(String msg) 
	{
		super(msg);
	}

}
public class Custom_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  throw new ShubhangiException("Own Exception");
	  
  }
  catch(Exception e) 
  {
	  
	  System.out.println(e);
	  
  }
	}

}
