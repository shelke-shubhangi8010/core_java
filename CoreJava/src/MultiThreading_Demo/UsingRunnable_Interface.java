package MultiThreading_Demo;


class ThreadDemo implements Runnable
{
	public void run() 
	{
		System.out.println("Thread is Running 1");
	}

}
public class UsingRunnable_Interface  
{ 
	
	public static void main(String[] args) {
		
     ThreadDemo t = new ThreadDemo();
		t.run();
		Thread t2=new Thread(t);
		t2.start();
	}

}
