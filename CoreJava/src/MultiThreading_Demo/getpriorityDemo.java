package MultiThreading_Demo;

public class getpriorityDemo  extends Thread
{
   public void Run()
   {
	   System.out.println(Thread.currentThread().getName());
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        getpriorityDemo t1=new getpriorityDemo();
        getpriorityDemo t2=new getpriorityDemo();
        getpriorityDemo t3=new getpriorityDemo();
        
        System.out.println(t1.getPriority());   // by default 5 priority  normal 
        System.out.println(t2.getPriority());
        System.out.println(t2.getPriority());
        
        t1.start();
        t2.start();
        t3.start();
        
	}

}
