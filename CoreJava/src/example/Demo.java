

package example;

import day1.day2.day3.Helper;  // user define package
    // nested package

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      System.out.println("calling example package");
      
      Helper h=new Helper();
      h.DemoHelper();
      h.testHelper();
      h.main(args);
	}
      // nested package
}
