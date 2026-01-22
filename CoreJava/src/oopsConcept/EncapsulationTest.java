package oopsConcept;
class Student1
{
	private String name;       //data hiding 
	
	public void setName(String name)         //setter
	{
		this.name=name;           //set name method
		
	}
	 public String getName()           //getter
	 {
		 return name;
	 }
}
public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student1 s = new Student1();
      s.setName("john");           //set the  name      ==setter
      System.out.println(s.getName());  // get the name    == getter
	}

}
