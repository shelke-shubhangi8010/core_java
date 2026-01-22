package oopsConcept;
class Human{
	// data member
	String name;
	int age;
	 public void displayInfo()    // member function
	 {
		 System.out.println("Name of human is :"+name);
		 System.out.println("Age of human is :"+age);
	 }
	
}
public class Set_Value_OfVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // creating the object
		Human h= new Human();      // object creation
		h.name="Shubhangi";     // setting data member
		h.age= 21;
		
		h.displayInfo();   // calling member function
		
		System.out.println(h.name);  // printing in object through
		System.out.println(h.age);
	}
  
	
}
