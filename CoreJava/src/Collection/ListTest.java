package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class ListTest {

	public static void main(String[] args) 
	{
		// first arraylist
       ArrayList a1 =new ArrayList();
       a1.add(101);
       a1.add("Ram");
       a1.add(103);
       a1.add("Male");
       a1.add("Pune");
       a1.add(56.34);
       a1.add(1, "Shyam");
       
       a1.add(1, "john"); // add the data
       System.out.println("original Array list"+a1);
       
       a1.set(0,"Shyam");   // replace the data
       System.out.println("Aftr replace ArrayList"+a1);
       
       System.out.println("get elemrnt of index of 4"+a1.get(4));
       
       //=====================================================================
       // second  Arraylist
       
       ArrayList a2 =new ArrayList();
       a2.add(104);
       a2.add("Radha");
       a2.add(108);
       
       // combine list
       a1.addAll(a2);   // adding data from another list/collection
       System.out.println(a1);
       
      
       /*
       // alternate way
       Iterator  itr= a1.iterator();
       while(itr.hasNext()) 
       {
    	   System.out.println(itr.next());
       }*/
        
	}

}


