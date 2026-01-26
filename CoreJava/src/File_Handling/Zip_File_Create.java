package File_Handling;
import java.io.File;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
public class Zip_File_Create {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub

		String sourceFile= "C:\\file data\\sample.txt";  //   txt file convert into zip file
		
		String  zipFile = "C:\\file data\\output.zip ";     // new zip file created 
		
		try {
		     
		     FileInputStream fos=new FileInputStream(zipFile);  // send data
		     ZipOutputStream zos =new ZipOutputStream(fos);
		     
		     File f1 = new File(sourceFile);
		     
		    FileInputStream fis=new FileInputStream(f1);   // send data
		    ZipEntry entry = new ZipEntry(f1.getName());
		    zos.putNextEntry(entry);
		    
		    byte[] bytes = new byte[1024];
		    int length;
		    while((length = fis.read())>=0);
		    {
		    	  zos.write(bytes,0,length);
		    	  
		    }
		    zos.close();
		    fos.close();
		    fis.close();
		    System.out.println("file is created");
		    
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

}
