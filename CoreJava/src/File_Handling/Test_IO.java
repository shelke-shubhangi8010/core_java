package File_Handling;

public class Test_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter character");
      
      
      try {
      int ch= System.in.read();
      System.out.println("U entered :"+(char)ch);
      }catch(Exception e)
      {
    	     System.out.println(e);
      }
      System.err.println("Test error system");
	}

}
