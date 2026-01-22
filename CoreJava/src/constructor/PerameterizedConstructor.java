package constructor;

//set the actual value from current executing the object
// accept the argument


class  Bustickit
{
	String passengerName;     //instance variable
	String destination;       //inside the class outside the method
	int ticketno;
	
	public Bustickit(String p,String d,int t) 
	{
		passengerName=p;   ///local variable
		destination=d;     //inside the method declare
		ticketno=t;
	}
	
	/*public void display() 
	{
		System.out.println("passenger :" +b1.passengerName);
		System.out.println("destination:"+b1.destination);
		System.out.println("id :" + b1.ticketno);


	}*/
	
}



public class PerameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bustickit  b= new Bustickit("john","pune",10);
System.out.println("passenger :" +b.passengerName);
System.out.println("destination:"+b.destination);
System.out.println("id :" + b.ticketno);
  // b1.display();

	}

}
