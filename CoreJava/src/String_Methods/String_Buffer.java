package String_Methods;

public class String_Buffer {

	public static void main(String[] args) {
		

		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());  // by default capacity 16
		
		sb.append("Welcome to all my home");
		System.out.println(sb.capacity());
		
		StringBuffer sb1 =new StringBuffer("Hello to java");
		System.out.println(sb1.capacity());
		
		System.out.println("length find:"+ sb1.length());
		System.out.println("reverse string:"+ sb1.reverse());
		System.out.println("character at specific index:"+ sb1.charAt(5));
		System.out.println("delete char at:"+  sb1.deleteCharAt(6));
		//System.out.println("set character"+sb1.setCharAt(5, 'K'));
		System.out.println("index of f:" + sb1.indexOf("f"));
		System.out.println(" is empty :" + sb1.isEmpty());
		System.out.println(" hashcode is :"+sb1.hashCode());
		System.out.println("substring :"+sb1.substring(3,5));
		System.out.println(" getclass :"+sb1.getClass());
	}

}

// length();= allow find length
/// reverse();=  string reverse
//  chatAt();  = return character in specific index
// setcharAt();
// deletecharAt();


// StringBuffer size increment   formula  = (previouscapacity+1)*2

/* String Buffer   declare  in 3 way
   
   1.StringBuffer sb=new StringBuffer();
   sb="Hello                            == cCreate string buffer of default size 16
   
   2.StringBuffer sb=new StringBuffer("Hello");   ==   create stringBuffer  of fixed size as string length
   
   3. Stringbuffer sb=new StringBuffer(int capacity);  ==   it will create stringBuffer with specified capacity
*/