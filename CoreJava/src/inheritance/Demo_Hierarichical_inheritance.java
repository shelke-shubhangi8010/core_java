package inheritance;        //hierarchical inheritance
class Car {        // Parent class
  public  void Drive() {
        System.out.println("Car is Driving");    
    }
}
class Vehical extends Car {   
   public void Stop() {
        System.out.println("Vehical is stop");
    }
}
class Bike extends Car {   
  public  void Ride() {
        System.out.println("Bike is riding");
    }
}
public class Demo_Hierarichical_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vehical v1=new Vehical();
	       v1.Drive();
	       v1.Stop();
	 Bike b1=new Bike();
	      b1.Ride();
	}
}
