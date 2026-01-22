package oopsConcept;

class ATMAccount
{
	private  int pin;
	private double Balance;
	 
   public void setPin(int pin) 
   {
	   this.pin=pin;
	   
   }

     public double getBalance(int enterpin) 
     {
    	     if(this.pin==enterpin) 
    	     {
    	    	   return Balance;
    	     }
    	     else {
    	    	 
    	    	 System.out.println("Incorrect pin");
    	    	 return -1;         //invalid responce
    	     }
    	 }
     
     
    public void credited(int enterpin,double amount) 
    {
    	   if(enterpin==pin) 
    	   {
    		  Balance = Balance+amount;
    		  System.out.println("Deposit :"+amount);
    	   }
    	   else
    	   {
    		  System.out.println("incorrect pin !");
    	   }
    }
     
    public void withdraw(int enterpin,double amount) 
    {
    	   if(enterpin==pin) 
    	   {
    		  Balance = Balance-amount;
    		  System.out.println("Withdraw :"+Balance);
    	   }
    	   else
    	   {
    		  System.out.println("incorrect pin !");
    	   }
    }  
}

public class ATMData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ATMAccount A= new ATMAccount();
   A.setPin(1111);             //set pin
   A.credited(1111, 10000);      //  deposit
   A.withdraw(1111, 200);        // withdraw
System.out.println("Balance is :"+A.getBalance(1111));      // check balance
	}

}
