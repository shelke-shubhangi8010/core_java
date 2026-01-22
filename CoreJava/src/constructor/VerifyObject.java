package constructor;

public class VerifyObject {

	public void info() 
	{
		System.out.println(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VerifyObject v=new VerifyObject();
		System.out.println(v);
		v.info();
		
		VerifyObject v2=new VerifyObject();
		System.out.println(v2);
		
		
	}

}
