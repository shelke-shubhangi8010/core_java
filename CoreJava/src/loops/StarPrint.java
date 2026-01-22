package loops;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		
     for(int i=0;i<r;i++) {
        for(int k=0;k<'i';k++)
        {
        	System.out.print("");
        }
        for(int j=0; ; j++)
    { 
        if(j  == r-i)
        {
        	  break;
        }
        System.out.print("*");
        
    }   
      System.out.println("") ; 
        
        
}
	
	}	

		
}


