package File_Handling;

import java.util.Scanner;

public class Test_hasNext_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner("Hello welcome to class \n your student");
		String msg = sc.next();
		System.out.println("your message is :"+msg);
		
		while(sc.hasNext()) 
		{
			System.out.println(sc.nextLine());
		}
	}

}
// hasNext Double,string , int  // seperate int,  string , charactter