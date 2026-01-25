package Object_Class_Methods;


class Employee implements Cloneable
{
	int id;
	String name;
	
	public Employee(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	
	public Object clone() 
	{
	return super.clone();
	}

	
	
	


public class Clone_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		try {
			
		Employee e1=new Employee(101,"Shubhangi");
		
        Employee e2= (Employee) e1.clone();   // implement class mapping
        
        System.out.println(e1.id+""+e1.name);
        System.out.println(e2.id+""+e2.name);
        
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
