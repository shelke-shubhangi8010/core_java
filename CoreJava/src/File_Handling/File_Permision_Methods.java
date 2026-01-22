package File_Handling;

//set the  permission of particular file

//1. read and write   :   setExecutable(false);
//2. read        :      setReadable(true);  // by default true
//3. write      :     setWritable(true);


//true  : permission granted
//false : permission denied


import java.io.File;

public class File_Permision_Methods {

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
			
			//System.out.println("is file Readable :" + f1.canRead());
			//System.out.println("is file Writable :" + f1.canWrite());
			//System.out.println("is file Executable :" + f1.canExecute());
			
			f1.setWritable(false);
			f1.setReadable(false);
			f1.setExecutable(true);
			
			System.out.println("is file Readable :" + f1.canRead());
			System.out.println("is file Writble :" + f1.canWrite());
			System.out.println("is file Executable :" + f1.canExecute());
			
		}
		catch(Exception e) 
		{
			
			System.out.println();
			
		}
		
	}

}
