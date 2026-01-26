package String_Methods;

public class String_Buffer {

	public static void main(String[] args) {
		

		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());  // by default capacity 16
		
		sb.append("Welcome");
		System.out.println(sb.capacity());
	}

}



/* String Buffer   declare  in 3 way
   
   1.StringBuffer sb=new StringBuffer();
   sb="Hello                            == cCreate string buffer of default size 16
   
   2.StringBuffer sb=new StringBuffer("Hello");   ==   create stringBuffer  of fixed size as string length
   
   3. Stringbuffer sb=new StringBuffer(int capacity);  ==   it will create stringBuffer with specified capacity
*/