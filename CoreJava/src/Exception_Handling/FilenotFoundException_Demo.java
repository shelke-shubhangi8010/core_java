package Exception_Handling;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class FilenotFoundException_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
     FileReader f= new FileReader("missing.txt");
		}catch(Exception e) 
		{
			System.out.println(e);
			System.out.println("File not found");
		}
	}

}
