package String_Methods;

public class methods_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello";
		String s1="world";
		System.out.println(s.concat(s1)); // Standard method  // concat ();
		
		String a=s+s1;  // by using + operator
		System.out.println(a);
		
		System.out.println("Length of string :"+ s1.length());  // length();
		
		System.out.println("Charcter At :"+s1.charAt(1));   // charAt();
		
		System.out.println("substring : "+a.substring(5, 10));  // substring();
		
		System.out.println("equal string  :"+s1.equals(s));    // equals();
		System.out.println("to uppercase :"+a.toUpperCase());  // touppercase();
		System.out.println("to lowercase :"+a.toLowerCase()); // tolowercase();
		
		System.out.println("join method using seperator :"+a.join(",","hello","to","all"));  // join();
		System.out.println("join method using seperator :"+a.join("::","6","10","2024"));
		System.out.println("join method using seperator :"+a.join("/","5","12","2025"));
		
		System.out.println("contains string cheak :"+a.contains("Hello"));          // contains();
		System.out.println("contains string cheak :"+a.contains("done"));// it will verify input string part of the string or not
		
		String p="     coding     ";
		System.out.println(p+"awesome");
		System.out.println(p.trim()+"awesome"); // trim();
		
		
		System.out.println(s.replace('H', 'M')); //replace  old new character
		
		
		
		// String class Methods

		//1.concat()      == it allow you concat two string
		//2. copy         == 
		// 3.comparison   ==
		// 4.length       == it allow to the find the length of string
		// 5.tostring
		//6. substring (start index , end index)  ==  starting index and data till end of the string  
		// 7. String tokenizer
		// 8. charAt()    == it will return character at specific index  // ex= charAt(3);
		// 9. equals();  == compare the data within two string
		             // true = string is equal
		             // false= string is not equal
		// 10.  touppercase() ==
		// 11. tolowercase()   ==
		// 12. join();    == join  the group of string by using seperator // ex = , :: / //
		// 13.  contains(string);  =  it wil verify  input is part of string or not  // ex=  s="awsome  "  s.contains("some); == o/p true   otherwise false
		// 14.  trim();    ==   it remove extra space from your string
		// 15. replace(oldchar,newchar); ==   replace the character
	}

}
