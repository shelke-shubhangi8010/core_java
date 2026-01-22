package constructor;
class TestStudent{
	int rollno;
	String name,course;
	float fee;
	public TestStudent(int rollno,String name,String course,int fee) {
		
		this.rollno=rollno;
		this .name=name;
		this.course=course;
			
	}

	public TestStudent(int rollno,String name,String course,fee) 
	{
		this(rollno,name,course);
		this.(fee=fee);
	}
public TestStudent(int rollno,String name,String course,float fee) {
		
		this.rollno=rollno;
		this .name=name;
		this.course=course;
			
	}
	public void display() 
	{
		System.out.println("roll no :"+rollno);
		System.out.println("std Name :"+name);
		System.out.println("std Course :"+course);
		System.out.println("Fee :"+fee);
	}
	
}
public class ConstructorChaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestStudent s=new TestStudent(121,"sneha","mca");
   s.display();
   TestStudent s1=new TestStudent(122,"siya","msc",3000);
   s1.display();
   
	}

}
