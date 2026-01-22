package Abstraction;
abstract class Bank
{
	abstract int interestrate();

}
class SBI extends Bank
{
	public int interestrate()   // abstract  method override must be in child class
	{
		return 5;
	}

}
class Axis extends Bank
{
	public  int interestrate() 
	{
		return 8;
	}
}
class HDFC extends Bank
{
	public  int interestrate() 
	{
		return 10;
	}
}
public class Test_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Bank b;
          b=new SBI();
          System.out.println("Rate of interest  SBI Bank  is :"+b.interestrate()+"%");
          
          b=new Axis();
          System.out.println("Rate of interest  Axis Bank  is  :"+b.interestrate()+"%");
	
          b=new HDFC();
          System.out.println("Rate of interest  HDFC Bank  is  :"+b.interestrate()+"%");     
	}

}
