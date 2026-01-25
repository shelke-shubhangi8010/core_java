package Inner_Classes;

class test
{
	public void name() 
	{
		System.out.println("Hello");
		
	}
}
public class Anonymous_In_Method {
      
	  public void show()
	  {        
		  test t=new test() 
		  
		                            
		  {             // anonymous class end with  ; 
			  public void Hello() 
			  {
				  System.out.println("Hello from methos anonymous");
			  }
			  
		  };
		 // t.Hello();
	  }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Anonymous_In_Method  a= new Anonymous_In_Method();
		a.show();
	}

}
