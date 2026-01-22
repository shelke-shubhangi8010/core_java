package Exception_Handling;

public class Throw_Throws_Demo {

	static void withdraw(int balance,int amount) throws Exception //  throws declare outside of method
	{
		if(amount > balance) 
		{
			throw new Exception("Insuficient balance");   // throw using inside the method
		}
		System.out.println("Please collect ypur cash");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
      withdraw(5000,7000);
		}catch(Exception e)
		{
			System.out.println("Transaction failed :"+e.getMessage());
			//System.out.println(e);
		}
      System.out.println("rest of code" );
	}

} 
