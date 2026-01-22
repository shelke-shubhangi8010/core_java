package Exception_Handling;

public class demoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			
			int a= 10,b=0;
			System.out.println("welcome to exception handling");
			System.out.println("Result Addition :"+a+b);
			System.out.println("Result Division :"+a/b);
			//System.out.println("Result  Substraction :"+(a-b));
		}
		catch(Exception e)
		{
			
			System.out.println(" can not divisibal by zero");
			
		}
		
		System.out.println("Rest of code");
		
		//int a= 10,b=0;
		//System.out.println("welcome to exception handling");
		//System.out.println("Result Addition :"+a+b);
		//System.out.println("Result Division :"+a/b);
		//System.out.println("Result  Substraction :"+(a-b));
		
	}

}
