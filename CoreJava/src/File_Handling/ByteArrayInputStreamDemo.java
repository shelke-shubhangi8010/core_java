package File_Handling;
import java.io.ByteArrayInputStream;
public class ByteArrayInputStreamDemo 
{

	public static void main(String[] args) 
	{
		

		try 
		{
			byte buf[]={48,51,34,56,67};
			ByteArrayInputStream bout=new ByteArrayInputStream(buf);
			int k=0;
			while((k=bout.read())!=-1)
            {
            	   char ch= (char)k;
            	   System.out.println("Ascii value of character  is :"  +k   +"Charactter is :" +ch);
            }
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	}

}
