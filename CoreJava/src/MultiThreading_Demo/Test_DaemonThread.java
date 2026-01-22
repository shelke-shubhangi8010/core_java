package MultiThreading_Demo;

// daemon thread
// purpose of daemon thread perform background services
// example  =  garbage collector, background logging
// totally depend on user thread
// use paerform specific task in end of the execution
// cheak  particular thread daemon or not use   isdaemon() method
// setdaemon()  particular thread is daemon 

/* 1. A thread is user thread by default.

2.You must set daemon thread before calling start().

3. Calling setDaemon(true) after start() causes
IllegalThreadStateException.

4. JVM exits when all user threads finish, even if daemon threads are running.
 */

public class Test_DaemonThread  extends Thread
{
    public void run()
    {  
    	   if(Thread.currentThread().isDaemon())  // t1.isdaemon() cheak daemon thread
    	   {
    	    System.out.println("Daemon Thread Execute");
    	   }
    	   else 
    	   {
    	    System.out.println("User thread execute");
    	   }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_DaemonThread t1=new Test_DaemonThread();
		Test_DaemonThread t2=new Test_DaemonThread();
		Test_DaemonThread t3=new Test_DaemonThread();
		
		
		t1.setDaemon(true);
		
		t1.start();
	    t2.start();
		t3.start();
	}

}
