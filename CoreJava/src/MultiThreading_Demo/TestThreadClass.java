package MultiThreading_Demo;

public class TestThreadClass  extends Thread
{
    public void run()   // predefine method // 
    {
    	System.out.println("Thread is Running");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadClass t=new TestThreadClass();
		
		t.start();   //  predefine method
		// it used thread run/start
	}

}

