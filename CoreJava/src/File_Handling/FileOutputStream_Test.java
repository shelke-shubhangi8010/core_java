package File_Handling;
import java.io.FileOutputStream;
public class FileOutputStream_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			FileOutputStream fs= new FileOutputStream("C:\\file data\\File data");
			
			String s="File handling programming";
			
			byte b[] = s.getBytes();
			
			fs.write(65);
			fs.close();
			
			System.out.println("Success");
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
	}

}
