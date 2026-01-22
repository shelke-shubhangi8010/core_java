package inheritance;

class user
{
	String name;
     public void login() 
     {
    	 System.out.println(name  +  "  logged in.");
     }
}
interface videoplayer
{
	public void playvideo(String courseName );
}
class Student extends user implements videoplayer
{
	public void playvideo(String courseName)
	{
		
		System.out.println("Student is Learning:" +courseName);
	}

}
class Teacher extends user implements videoplayer
{
	public void playVideo(String courseName)
	{
		System.out.println("teacher is reviewing video :" + courseName);
	}

	@Override
	public void playvideo(String courseName) {
		// TODO Auto-generated method stub
		
	}
}
public class Demo_Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s= new Student();
		
		s.name = "shubhangi";
		s.login();
		s.playvideo("Java oops Concept");
		
		Teacher t=new Teacher();
		t.name = "Mr.deshmukh Sir";
		t.login();
		t.playVideo("Java oops Concept Review");
	}

}
