package Collection;

import java.util.ArrayList;

public class Explore_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		
		a1.add(101);
		a1.add("Shubhangi");
		a1.add(22);
		a1.add("Shevgaon");
		a1.add("Female"); 
		System.out.println("Origineal Arraylist :" +a1);
		System.out.println("Exact same Duplicate copy in Arraylist :"+a1.clone());
		System.out.println("Cheak data is present or not in Given ArrayList :"+a1.isEmpty());
		System.out.println("Return of last index of Arraylist :"+a1.lastIndexOf(a1));
		System.out.println("element are present in arraylist :"+a1.size());
		System.out.println(" Sublist Of Arraylist :"+ a1.subList(1,4));
		
		Object[] arr=a1.toArray();
		System.out.println("All array Element : ");
		for(Object o: arr)
		{
		System.out.println(o);
		} 
	}

}
