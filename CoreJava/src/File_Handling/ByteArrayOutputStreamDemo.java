package File_Handling;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
	    {
			FileOutputStream Fout1 = new FileOutputStream("C:\file data\\Test1.txt");
			FileOutputStream Fout2 = new FileOutputStream("C:\file data\\Test2.txt");
			FileOutputStream Fout3 = new FileOutputStream("C:\file data\\Test3.txt");
			
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			bout.write(65);
			
			bout.writeTo(Fout1);
			bout.writeTo(Fout2);
			bout.writeTo(Fout3);
			
			
			bout.flush();
			bout.close();
	    }
		catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("write successfully");
		
	}

}
