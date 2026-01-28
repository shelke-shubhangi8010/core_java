package Collection;
import  java.util.ArrayList;
import java.util.Iterator;
class PersonInfo
{
	int id;
	String name;
	int age;
	String city;
	public PersonInfo(int id,String name,int age,String city) 
    {
		this.id=id;
		this.age=age;
		this.city=city;
		this.name=name;
		
		
	}

}
public class TestPersonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonInfo p1= new PersonInfo(101,"Riya",20,"Nagpur");
		PersonInfo p2= new PersonInfo(102,"Riya",24,"Pune");
		PersonInfo p3= new PersonInfo(103,"Riya",25,"Shevgaon");
		PersonInfo p4= new PersonInfo(104,"Riya",26,"Parner");
		
	ArrayList<PersonInfo> a1=new ArrayList<PersonInfo>();
		
	Iterator itr=a1.iterator();
	
	while(itr.hasNext()) 
	{
		PersonInfo p=(PersonInfo) itr.next();
		System.out.println( "Person id :"+p.id +"Person name :"+p.name +"Person city :"+p.city + "Person age :"+p.age);
		
	}
	}

}
 // interview
// Q.  how we can able to save the class object to list
