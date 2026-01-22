package Exception_Handling;
 // raised forcefully exception  using throw keyword
 // handled only one exception in your program
//  unchecked / runtime Exception using throw keyword
// unchecked exception can not declare it
// declare in inside method
public class Throw_Keyword {
   public static  void validate(int age)
   {
	   if(age<18) 
	   {
		   throw new ArithmeticException("The person not allow the vote");
	   }
	   else 
	   {
		   System.out.println("Invalid voting age");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // validate(21);
		try {
		validate(14);
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("Rest of code");
	}

}
