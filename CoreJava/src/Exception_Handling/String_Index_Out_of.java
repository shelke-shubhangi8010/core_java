package Exception_Handling;

public class String_Index_Out_of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		String a="java";
		System.out.println("print the character :"+a.charAt(5));
       }
       catch(Exception e) 
       {
    	   System.out.println("Invalid String index");
       }
		 System.out.println("rest of the code");
	}

}
