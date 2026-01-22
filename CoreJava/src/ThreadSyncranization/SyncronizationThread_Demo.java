
package ThreadSyncranization;

//   Syncronization
 // multiple thread access one resources
// non thread safe environment

class Table5
{
	synchronized public void printable(int n) 
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
//thread 1

class MyThread3 extends Thread
{
	Table t;
	public MyThread3(Table t)
	{
		this.t=t;
	}

  public void run() 
  {
  	   t.printable(5);
  }
}
// thread 2
class MyThread4 extends Thread
{
	Table t;
	public MyThread4(Table t)
	{
		this.t=t;
	}

  public void run() 
  {
  	   t.printable(100);
  }
}
public class SynchronizationThread_Demo {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		Table5 t=new Table5();
		MyThread3 t3 = new MyThread3(t);
		MyThread4 t4 = new MyThread4(t);
		t3.start();
		t4.start();
		
	}

}