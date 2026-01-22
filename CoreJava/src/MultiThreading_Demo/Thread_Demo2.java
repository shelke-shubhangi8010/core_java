package MultiThreading_Demo;

public class Thread_Demo2 {
     public  void Run() 
     {
    	 for(int i=0;i<5;i++)
    	{
      try 
    	    {
    		 
    		    Thread. sleep(500);
    	    }
    	 catch(Exception e) 
    	   {
    		 System.out.println(e);
    	    }
      
    }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Thread_Demo2 t1=new Thread_Demo2();
   t1.Run();
	}

}
