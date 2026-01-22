package inheritance;
class  SearchService
{        // same name different parameter
	    // compile time  /static /early binding/ method overloading
	public void search(String Name) 
	{
		System.out.println("Searching by name :"+Name);
	}

	public void search(int id) 
	{
		System.out.println("Searching by name :" + id);
	}

	public void search(String Name,String City) 
	{
		System.out.println("Searching by name:"+Name +""+City);
	}
}

public class ExampleMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchService s=new SearchService();
	    s.search("T-shirt");
		s.search(1000);
		s.search("neha", "pune");
	}

}
