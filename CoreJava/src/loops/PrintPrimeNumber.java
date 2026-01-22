package loops;
import java.util.*;
public class PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
    int num=20,  count=0;
      for(int i=1;i<=20;i++)
      {
    	     for(int j=1;j<=i;j++)
    	     {  
    	    	 if(i%j==0)
      	       {
      	    	   count++;
      	       }
    	     }
      	       if(count==2)
      	       {
      	    	   System.out.println(i + " ");
      	       }
      	      
    	    	 
    	     }
      }
	}


