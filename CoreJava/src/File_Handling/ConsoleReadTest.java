package File_Handling;
import java. io.Console;
public class ConsoleReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
     Console c= System .console();
     
     
     System.out.println("Enter Your name");
     String name = c.readLine();
     System.out.println("Thank you" +name);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
