package Exception_Handling;


class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message) 
	{
		super(message);
	}
}

public class CustomException_ageDemo {
static void checkage(int age)  throws InvalidAgeException
{
	if(age<18) 
	{
		throw new InvalidAgeException("age must be 18 or above");
	}
	else
	{
		System.out.println("valid age :"+age);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try{
    	checkage(15);
    }catch(Exception e)
    {
    	System.out.println(e);
    }
	}

}
