package inheritance;

  class student 
 {
	    public void nav() 
	    {
		System.out.println("Name : Shubhangi shelke");
		
	    }
 }
class Teachers extends student
     {
    	     public void Tjob()
    	     {
    	    	 System.out.println("Job: Software developer");
    	     }
     }
     


public class Singal_Inheritance
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   Teachers emp = new Teachers();
		emp.Tjob();
	   emp.nav();
		
		
	}

}

//car    child class
//vehical  parent class 


