package File_Handling;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;

public class Buffered_Reader_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			Reader r=new FileReader("output1.txt");
			BufferedReader br =  new BufferedReader(r);
			int d;
			while((d=br.read())!=-1)
			{
				System.out.print((char)d);
			}
			br.close();
			r.close();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	
	// chararrayReader/Writer
	// filter(reader/writer)
	// piped (reader/writer)
	// String(reader/writer)
	// InputStream Reader
	// OutputStream Reader

}
