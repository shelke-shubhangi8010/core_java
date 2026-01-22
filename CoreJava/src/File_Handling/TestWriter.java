package File_Handling;
import java.io.Writer;
import java.io.FileWriter;
public class TestWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			Writer w=new FileWriter("output.txt");
			String content ="I like pune \n";
			
			w.write(content);
			w.append("I like travell in india");
			w.close();
			System.out.println("Write successfully");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
	}

}
