package File_Handling;
import java.io.File;
public class Demo_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			File f1=new File("C:\\file data\\sample1.txt");
			
			if(f1.createNewFile()) 
			{
				System.out.println("File name "+f1.getName() + "is created");
			}
			else 
			{
				System.out.println("File already exits");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
	}

}
