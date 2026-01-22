package MultiThreading_Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class workThread implements Runnable
{
	private String message;
  public  workThread(String message)
   {
	   this.message=message;
   }
  public void  Run()
  {
	  System.out.println(Thread .currentThread().getName() +"(start)message"+message);
	  processmessage();
	  System.out.println(Thread .currentThread().getName() +"(end)");
  }
  private void processmessage() 
  {
	  try 
	  {
		  Thread.sleep(2000);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}


public class Demo_Thread_Pool  
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ExecutorService exec = Executors.newFixedThreadPool(5);
  
  for(int i=1;i<=10;i++)
  {
	  Runnable worker = new workThread(" "+i);
	  exec.execute(worker);
  }
  exec.shutdown();
  
  
  
	}

}
