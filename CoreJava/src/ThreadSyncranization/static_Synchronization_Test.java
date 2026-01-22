package ThreadSyncranization;

class PrintDetails
{
	public static synchronized void printmessage(String s)  
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good night....");
			System.out.println(s);
			
			try 
			{
				Thread.sleep(1000);
			}catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}

}

class Mythread111 extends Thread
{
	
   PrintDetails d;
   String s;
   public Mythread111(PrintDetails d,String s)
   {
	   this.d=d;
	   this.s=s;
	   
   }
 public void run() 
 {
	 d.printmessage(s);
 }

}


public class static_Synchronization_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PrintDetails  p=new PrintDetails();
    PrintDetails  p1=new PrintDetails();
    
    Mythread111 t1=new Mythread111(p,"siya");
    Mythread111 t2=new Mythread111(p1,"seema");
    
    t1.start();
    t2.start();
    
	}

}
