package ThreadSyncranization;

  //  non - Syncronization
   // multiple thread access one resources
  // non thread safe environment

class Table
{
	public void printable(int n) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				Thread .sleep(500);
				
			}catch(Exception e) 
			{
				System.out.println(e);
			}
		}
		
	}

}
// thread 1

class MyThread1 extends Thread
{
	Table t;
	public MyThread1(Table t)
	{
		this.t=t;
	}

    public void run() 
    {
    	   t.printable(5);
    }
}
 // thread 2
class MyThread2 extends Thread
{
	Table t;
	public MyThread2(Table t)
	{
		this.t=t;
	}

    public void run() 
    {
    	   t.printable(100);
    }
}
public class withoutSyncronization {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		Table t=new Table();
		MyThread1 t1=new MyThread1(t);
		MyThread2 t2=new MyThread2(t);
		t1.start();
		t2.start();
		
	}

}
