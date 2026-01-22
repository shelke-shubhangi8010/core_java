package File_Handling;
import java. io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			FileInputStream Fin = new FileInputStream("C:\file data\\Test.txt");
			DataInputStream din=new DataInputStream(Fin);
			int count = Fin.available();
			
			byte[] arr=new byte[count];
			din.read(arr);
			
			for(byte bt:arr)
			{
				char k=(char)bt;
				System.out.print(k + " - ");
				
			}
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
	}

}
