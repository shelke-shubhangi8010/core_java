package scannerDemo;

import java.util.Scanner;

public class AllDatatypeswithscanner {

	public static void main(String[] args) 
	
		{
			Scanner sc = new Scanner(System.in);
			
			//int
			System.out.println("Enter an integer :");
			int myint = sc.nextInt();
			
			//long
			System.out.println("Enter a long number:");
			long mylong = sc.nextLong();
			
			//float
			System.out.println("Enter a float number:");
			float myfloat = sc.nextFloat();
			
			//double
			System.out.println("Enter a double number:");
			double mydouble = sc.nextDouble();
			
			//boolean
			System.out.println("Enter a true or false:");
			boolean myboolean = sc.nextBoolean();
			
			//char
			System.out.println("Enter a charcter:");
			char mychar = sc.next().charAt(0);
			
			//string
			sc.nextLine(); //consume the next line
			System.out.println("Enter a string with spaces:");
			String myString = sc.nextLine();
			
			//output of all  values

			System.out.println("Integer:"+myint);
			System.out.println("Long:"+mylong);
			System.out.println("Float:"+myfloat);
			System.out.println("Double:"+mydouble);
			System.out.println("Boolean:"+myboolean);
			System.out.println("Charcter:"+mychar);
			System.out.println("string:"+myString);
		}

	}


