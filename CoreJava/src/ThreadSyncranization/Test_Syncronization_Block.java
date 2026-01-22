package ThreadSyncranization;

class Table1
{
	synchronized public void printable(int n) 
	{
	synchronized(this)    // synchronized block
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
		
	
    for(int j=1;j<=5;j++) 
    {
    	System.out.println("other calculation in printtabel method");
    	
    	try {
			Thread .sleep(500);
			
		}catch(Exception e) 
		{
			System.out.println(e);
		}
    }
    }
}


class Thread1 extends Thread
{
	Table1 t;
	public Thread1(Table1 t)
	{
		this.t=t;
	}

    public void run() 
    {
    	   t.printable(5);
    }
}
 // thread 2
class Thread2 extends Thread
{
	Table1 t;
	public Thread2(Table1 t)
	{
		this.t=t;
	}

    public void run() 
    {
    	   t.printable(100);
    }
}

public class Test_Syncronization_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 Table1 obj= new Table1();
		 Thread1 t11=new Thread1(obj);
			Thread2 t22=new Thread2(obj);
			t11.start();
			t22.start();
	}

}
