package ThreadSyncranization;
class Nottest 
{
	synchronized void waitingMethod() 
	{
		System.out.println(Thread.currentThread().getName() +" is waiting");
		try {
			wait(); // method
		} 
		catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() +" resumed");
	}

	synchronized void notifyMethod() 
	{
		System.out.println("notifyall method");
		notifyAll();
		
	}
	
}

class MyThreadDemo extends Thread
{
	Nottest t;
	public MyThreadDemo(Nottest t)
	{
		this.t=t;
	}

    public void run() 
    {
    	t.waitingMethod();
    }
}
public class Testnotifyall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nottest obj=new Nottest();
       MyThreadDemo t1=new MyThreadDemo(obj);
       MyThreadDemo t2=new MyThreadDemo(obj);
       
       t1.setName("Thread - 1");
       t2.setName("Thread - 2");
       t1.start();
       t2.start();
       
	}

}
