package Exception_Handling;

public class NoFormat_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		try 
		{
		String s="abc";
        int num= Integer.parseInt(s);
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Invalid Number format");
		}
	}

}
