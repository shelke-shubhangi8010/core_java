package File_Handling;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
public class dataOutputstreamDemo {

	public static void main(String[] args)
	{
	
		try
		{
			FileOutputStream Fout = new FileOutputStream("C:\file data\\Test.txt");
			DataOutputStream  dout  = new DataOutputStream(Fout);
			dout.writeInt(65);
			dout.flush();
			dout.close();
			
		}catch(Exception e) 
		{
			System.out.println(e);
		}
System.out.println(" File write Successfully");
	}

}
