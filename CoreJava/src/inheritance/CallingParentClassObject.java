package inheritance;

class Animal2
{
	String name="Generic animal";    //parent class    
}
class Dog1 extends Animal2{
	String name="Marfi";
	public void printName() {
		System.out.println("child name :"+name);
		System.out.println("parent name :"+super.name);       ///access parent class property using super keyword
	}
}
public class CallingParentClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog1 d=new Dog1();
         d.printName();
	}

}
