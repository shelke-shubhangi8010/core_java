package Static_Keyword;

public class StaticVariableDemo {

	static int count=0;    // static variable
	 int count1=0;        // instance variable
	public StaticVariableDemo()
	{
		count++;
		System.out.println(count);
		count1++;
		System.out.println(count1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableDemo s1= new StaticVariableDemo ();
		StaticVariableDemo s2= new StaticVariableDemo ();
		StaticVariableDemo s3= new StaticVariableDemo ();
	}

}
