package ThreadSyncranization;

 //wait()
// notify()
// notifyall()
class Customer
{
	int amount = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw");
		if(this.amount<amount)
		{
			System.out.println("less balance,waithing for deposit....");
			try {
				wait(); // method
			} 
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
		this.amount -=amount;
		// this. amount=this.amount-amount;
		System.out.println("withdraw completed");
	}
	
	
	synchronized void Deposit(int amount)
	{
		System.out.println("Going to  deposit");
		
		this.amount +=amount;
		// this. amount=this.amount+amount;
		System.out.println("Deposit completed");
		
		notify();    // method
	}

}
public class Inter_Thread_CommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Customer c=new Customer();   // reference final
		
		// withdraw
		new Thread()       // anonymous class
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		
		// deposit
		new Thread()       // anonymous class
		{
			public void run()
			{
				c.Deposit(10000);
			}
		}.start();
		
	}

}
