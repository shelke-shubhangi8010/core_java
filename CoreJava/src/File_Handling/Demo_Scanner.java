package File_Handling;
import java.util.*;
public class Demo_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a message");
		//String msg = sc.nextLine();
		
		String msg = sc.next();
		System.out.println("your message is :"+msg);
		
		
		while(sc.hasNext()) 
		{
			System.out.println(sc.next());
		}
		System.out.println("Your messge is :"  +msg);
		sc.close();
	}

}
