package oopsConcept;
class A
{
	int age;
	String name;
   public void show() 
   {
	   System.out.println("Print Age :"+age);
	   System.out.println("Print name :"+name);
   }

}
public class Call_ValuePassVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.age=10;     // value assign
a.name="neha";
a.show();
	}
 
}
