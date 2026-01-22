package Practice_Example_Oops_Concept;

class Animal
{
	public void colour()
	{
		System.out.println("Animal colour are black");
	}
}
class Dog extends Animal
{
	public void bark() 
	{
		System.out.println("dog is barking");
	}

}


public class singal_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog d=new Dog();
    d.bark();
    d.colour();
	}

}
