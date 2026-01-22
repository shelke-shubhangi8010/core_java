package conditionalStatement;
import java.util.*;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int marks =sc.nextInt();
		if(marks>=90)
		{
			System.out.println("Grade is A");
		}
		else if(marks>=75)
		{
			System.out.println("Grade is B");
		}
		else if (marks>=40)
		{
			System.out.println("Grade is D");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
