package constructor;

class student{
	
	String Name;
	int age;
	
	student()
	{
		Name="Unknown";
		age=0;
		System.out.println("default constructor called ");
	}
}
public class DemoDefault {

	student d=new student();
	
	//System.out.println("d.Name" );
	//System.out.println("d.age" );
}
