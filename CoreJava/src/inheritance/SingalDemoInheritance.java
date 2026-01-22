package inheritance;
class bank
{
	public void amount() 
	{
		System.out.println("Amount : bank transfer the amount");
    }
}
class customer extends bank
{
	public void Passbook() 
	{
		
		System.out.println("Passbook : Customer Passbook id is incorrect");	
	}
}


public class SingalDemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     customer s=new customer();
     s.Passbook();
     s.amount();
	}

}
