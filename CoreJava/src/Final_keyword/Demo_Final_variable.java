package Final_keyword;
// final keyword
// 1. variable, ==  like a constant  ,  
//                  once we initalize it we can't able to change it value

// 2. method, ==  declare in final keyword 
//                which can not be overridden in child class

// 3. class  ==    declare with final keyword 
//                which  can not be inherited (not able to extend that class by extend keyword)


// can not modify it 

class UserAccount
{
	final String accountNumber = "ACC345678";
    public void display() 
    {
    	   System.out.println("Account Number :"+accountNumber);
    }

}
public class Demo_Final_variable {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   UserAccount u=new UserAccount();
   u.display();
   // accountNumber ="acn90786789";      // its constant 
	}

}
