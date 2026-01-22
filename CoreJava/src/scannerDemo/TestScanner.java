package scannerDemo;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1St Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number  ");
		int num2 = sc.nextInt();
		int result = num1+num2;
		System.out.println("addition :" +result);
	}
}
