package conditionalStatement;
import java.util.Scanner;
public class evenOddNum {

	public static void main(String[] args) {
	Scanner sc= new Scanner("system.in");
System.out.println("Enter a number");
      int num=sc.nextInt();
      if(num>=0)
      {
    	  if(num%2==0)
    	  {
    		  System.out.println("Number is Even");
    	 
    	  }else 
    	  {
    	    System.out.println("Number is Odd");
    	  }
    	  
      }else {
    		  System.out.println("Number is negative");
    	  }
      }
	}


