package File_Handling;

import java.io.File;

// createNewfile();   == new file create
// get name();      ==   get  file name
// canRead();    == data read file
// canWrite();    == data write file
//getabsoluatePath();   == get file path
//length();   == file data length
// delete();   == delete file


// set the  permission of particular file

// 1. read and write   :   setExecutable(false);
// 2. read        :      setReadable(true);  // by default true
// 3. write      :     setWritable(true);


// true  : permission granted
// false : permission denied

public class File_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			File f1=new File("C:\\file data\\sample1.txt");
			
			if(f1.createNewFile())  // file create
			{
				System.out.println("File name "+f1.getName() + "is created");
			}
			else 
			{
				System.out.println("File already exits");
			}
			System.out.println("path of file :"+f1.getAbsolutePath());
			System.out.println("Do you have read a data in file :"+f1.canRead());
			System.out.println("Do you have Write a data in file :"+f1.canWrite());
			System.out.println("length of character :"+f1.length());
			
			
			if(f1.delete())  // file delete
			{
				System.out.println("File name "+f1.getName() + "is deleted");
			}else 
			{
				System.out.println("Error Occur during deletion");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
		
	}

}
