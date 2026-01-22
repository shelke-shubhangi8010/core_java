package Exception_Handling;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
// throws= declare
// checked / compile
// after method declaration
// compultion to used  try catch block
// it  handelled multiple exception
public class Throws_Keyword {
       static void readFile() throws IOException  // after method declaration using throws keyword
      {
    	   
    	     FileReader fr=new FileReader("text.txt");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
   readFile();
  }catch(Exception e) 
  {
	  System.out.println(e);
  }
   System.out.println("Restof the code");
	}

}
