package File_Handling;
import java.io.FileReader; 
import java.io.Reader;

public class TestReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Reader r= new FileReader("output.txt");
			int data = r.read();
			while(data!=-1)
			{
				System.out.print((char)data);
				data=r.read();
			}
			r.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
	}

}
