package conditionalStatement;
import java.util.*;
public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Electricity Units") ;
    		int units =sc.nextInt();
     
    		if(units<100)
    		{
    			System.out.println("Usage : low");
    			
    		}
    		else if(units>=100 && units<=400);
    		{
    			System.out.println("Usage : medium");
    		}
    		 if(units > 400)
    		{
    			System.out.println("Usage : High");
    		}
     
	}

}
