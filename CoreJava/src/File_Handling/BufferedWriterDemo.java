package File_Handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			Writer w=new FileWriter("output1.txt");
			BufferedWriter bw = new BufferedWriter(w);
            String content ="I have pen \n";
			
			bw.write(content);
			bw.append("I like to live in india");
			bw.close();
			System.out.println("Write successfully");
		}
		catch(Exception e) 
		{
			System.out.println("e");
		}
		
		
	}

}
