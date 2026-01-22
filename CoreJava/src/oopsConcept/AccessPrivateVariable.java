package oopsConcept;
class StudentClass
{
	private int Rollno;
	private String Sname;
	
	public void setter(int r) 
	{
		this.Rollno=r;
		
	}
	public int getter() 
	{
		return Rollno;
	}
	
	public void Set(String n) 
	{
		this.Sname=n;
	}
	public String get() 
	{
		return Sname;
		
	}
	
}
public class AccessPrivateVariable
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       StudentClass s = new StudentClass();
       s.setter(102);
       System.out.println(s.getter());
       s.Set("Shubhangi");
       System.out.println(s.get());
	}

}


