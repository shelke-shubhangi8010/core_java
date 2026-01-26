package String_Methods;

public class Test_Mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("Hello");  // immutable string
		                               // do not change data// not concat
		s.concat("shubhra");
		System.out.println(s);
		
		StringBuffer s1=new StringBuffer("Hello");  // mutable string
		s1.append("Krishna");                       // change data   
		System.out.println(s1);
		
		StringBuilder sb=new StringBuilder("Hello");  // mutable string
		sb.append("Krishna");
		System.out.println(sb);
		
		//  immutable  string = do not modify it
		// mutable  string =  modify it
	}

}
