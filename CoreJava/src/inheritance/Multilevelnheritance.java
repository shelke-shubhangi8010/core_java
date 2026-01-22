package inheritance;

class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Mammal extends Animal      // parent
{
	public void walk()
	{
		System.out.println("Mammal is walking");
	}
}
class Dog extends Mammal       // child class
{
	public void bark() 
	
	{
		System.out.println("Dog is barking");
		
	}
}
public class Multilevelnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d =new Dog();   // object create in child class
		
		d.eat();
		d.walk();
		d.bark();
	}

}

//-------Task-----//

//person   
//manager
//employee