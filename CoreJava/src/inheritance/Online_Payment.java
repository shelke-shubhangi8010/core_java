package inheritance;

interface Payment
{
	public void paymentprocess(double amount);
	
}
interface Notification
{
	public void paymentProcess(String msg);
}
class onlineOrder implements Payment,Notification
{
	public void paymentprocess(double amount)
	{
		System.out.println("payment of" +amount +"payment successfully");
	}
	public void sendNotification(String msg)
	{
		System.out.println("Notification sent :"+msg);
	}
	@Override
	public void paymentProcess(String msg) {
		// TODO Auto-generated method stub
		
	}
}
public class Online_Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
onlineOrder order =new onlineOrder();
      order.paymentprocess(1426.00);
      order.sendNotification("order has been placed");
      order.sendNotification("payment successfully");
		
	}
      ///login page      username password     notification = login successfully =msg
}    

