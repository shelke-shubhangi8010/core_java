package Final_keyword;
// final method can not be override
class bank
{
	final void ProcessTransection() 
	{
		System.out.println("processing bank transation");
		
	}

}
public class Demo_Final_Method extends bank

{

	public void payBill()
	{
		System.out.println("calling for final method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_Final_Method b=new Demo_Final_Method();
    b. payBill() ;
    b.ProcessTransection();
	}

}
