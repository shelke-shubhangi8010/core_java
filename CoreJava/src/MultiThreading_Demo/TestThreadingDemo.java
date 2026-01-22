package MultiThreading_Demo;

class Demo implements Runnable
{
	public void run() 
	{
		System.out.println("Thread Running");
	}

}
public class TestThreadingDemo 
{
	public static void main(String[] args) 
	{ 
		Runnable r= new Demo();
		Thread  t=new Thread(r,"MY Thread1");
		t.start();
	String  s=	t.getName();
	System.out.println(s);
	}

}
