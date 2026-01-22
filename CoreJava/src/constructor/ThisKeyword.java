package constructor;

// this keyword assign current executing instance variable
// Constructor call used  this() method
// this is method /   keyword



class  bustickit
{
	String passengerName;     //instance variable
	String destination;       //inside the class outside the method
	int ticketno;           
	
	public bustickit(String passengerName,String destination,int ticketNo) 
	{
		this.passengerName=passengerName;   ///local variable
		this.destination=destination;     //inside the method declare
		this.ticketno=ticketno;
	}

}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bustickit  b= new bustickit("john","pune",230);
		
		System.out.println("passenger :" +b.passengerName);
		System.out.println("destination:"+b.destination);
		System.out.println("id :" + b.ticketno);
		
	}

}
