package File_Handling;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
public class BufferedinputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			FileInputStream fis = new FileInputStream ("C:\\file data\\test.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			
			int j;
			while((j=bis.read())!=-1) 
			{
				System.out.println((char)j);
			}
			
			fis.close();
			bis.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
	}

}
