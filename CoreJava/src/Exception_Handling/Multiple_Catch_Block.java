package Exception_Handling;

public class Multiple_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Wel come to exception");
		try {
			int a[] =new int[4];
			a[5]=20/0;
			
			String n=  null;
			System.out.println(n.length());
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("can not divisibal by Zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Invalid Array inndex");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the  codde");
	}

}
