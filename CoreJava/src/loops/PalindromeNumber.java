package loops;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println("Enter number");
     //int num=121;
     int rev=0;
     int temp=num;
     while(num>0)
     {
    	 int rem=num%10;
    	 
    	 rev=rev*10+rem;
    	 num=num/10;
     }
     if(temp==rev)
     {
    	  System.out.println("number is palindrome");
    	 
     }else {
    	 
    	 System.out.println("Number is not Palindrome");
     }
    	 
    	 
	}

}
