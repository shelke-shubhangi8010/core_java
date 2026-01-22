package Super_Keyword;
class BankAccount
{
	String bankName="State Bank Account";   // instance variable
    BankAccount()        // parent constructor
    {
    	System.out.println("Bank account constructor called");
    }

   public void displayAccountType()   //
   {
	   System.out.println("Account Type :General bank account ");
   }
}

class SavingAccount extends BankAccount
{
	String bankName="HDBC";     // access parent instance variable
      public SavingAccount() 
      {
    	      super();    // parent  constructor  call must in child constructor in first line
    	     super.displayAccountType();  // parent method calling
    	  System.out.println("Saving Accoount constructor called ");
      }

    public void DisplayDetails()
    {
    	   System.out.println("Child bank name :"+bankName);
    	   System.out.println("parent bank name :"+super.bankName);
    }
}
public class Super_Uses_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SavingAccount s=new SavingAccount();
     s.DisplayDetails();
	}

}
