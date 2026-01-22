package Object_Class_Methods;

class Student
{
	int rollNo;
	String name;
	
	 public Student(int rollNo,String name) 
	 {
		 this.rollNo =rollNo;
		 this.name=name;
	 }
	 
	/* public void show() 
	 {
		 System.out.println("Roll Number :"+rollNo);
		 System.out.println("Name :"+name);
	 }*/
	 
	 public String  toString() 
	 {
		// return "student roll no :"+rollNo " ,Name "+name;
		 String s=new String("rollno :"+rollNo+" ,name"+name);
		 return s;
	 }
}
public class toString_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1= new Student(101,"siya");
		//s1.show();
		System.out.println(s1);
	}

}
