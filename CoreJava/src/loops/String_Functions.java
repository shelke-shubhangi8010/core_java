package loops;

public class String_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 ="java programming";//String declaration 1st way
String str2 = new String("ADVANCED jaVa");//2nd way
String str3 ="java programming";
		System.out.println(str1);
		System.out.println(str2);
		
		//concatination using + operator
		
		String result =str1+"  "+str2;
		System.out.println(result);
		
		//length function
		
		int length=str1.length();
		System.out.println("Length of String :"+length);
		
		// any one character
		System.out.println("one character visible :" +str1.charAt(6));
		System.out.println("one character visible :" +str2.charAt(8));
		
		//substring
		
		System.out.println("Sub String :" +str1.substring(5));
		System.out.println("Sub String :" +str2.substring(2,8));
		
		//uppercase
		
		System.out.println("uppercase :" +str1.toUpperCase());
		
		//Lowercase
		System.out.println("Lowercase :" +str2.toLowerCase());
		
		// cheak contain in String
		
		System.out.println("contain is :" +str1.contains("pro"));
		System.out.println("contain is :" +str1.contains("PRO"));
		
		//cheak character indexing value in string
		
		System.out.println("element of :"+str1.indexOf('g'));
		
		//replace the character in  string
		
		System.out.println("Replace  :" +str1.replace('v','w'));
		System.out.println("Replace character :" +str2.replace("java","c language"));
		
		//cheak equality
		
		System.out.println("equal or not :"+str1.equals(str2));
		System.out.println("equal or not same character :"+str1.equals(str3));
		
		System.out.println("equal ignoreCase:"+str1.equalsIgnoreCase(str3));
		
		//trim
		System.out.println(str3);
		System.out.println("trim string :  "+str3.trim());
		
		//reverse string 
		StringBuilder s = new StringBuilder(str1);
		System.out.println("reverse : "+s.reverse());
		
		//2nd way reverse string
		String rev="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
			//System.out.println(str2.chatAt(i));
		}
		System.out.println(rev);
		
		//concat   string   //add
		System.out.println();	
		System.out.println(str2.concat(str3));
		
//append 
		StringBuilder s1 = new StringBuilder(str1);
		//System.out.println(s1.append(str1));
		System.out.println(s1.append(str2));
		
		System.out.println(s1.append("     Language"));
			
		
	  }
}
