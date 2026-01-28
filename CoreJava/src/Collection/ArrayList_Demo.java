package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList a3=new ArrayList();
		a3.add(10);
		a3.add(20);
		a3.add(67);
		a3.add(78);
		
		System.out.println("Original array list :"+a3);
		
		Collections.sort(a3);
	
		System.out.println("sorted array list :"+a3);
		
		
		ArrayList a4=new ArrayList();
		a4.add("Neha");
		a4.add("Mangesh");
		a4.add("Anjali");
		a4.add(" Shubhangi");
       System.out.println("Original array list :"+a4);
		
		Collections.sort(a4);
		System.out.println("Assending sorted array list :"+a4);
		
		Collections.sort(a4,Collections.reverseOrder());
		System.out.println("desending sorted Array list :"+a4);
		
		a4.remove(2);
		System.out.println("remove element Array list :"+a4);
		
		a4.remove("Neha");
		System.out.println("remove element Array list :"+a4);
		
		a4.addAll(a3);      // copy list
		System.out.println("Add all Array list"+a4);
		
		a4.removeAll(a3);     // delete list
		System.out.println(" after remove all : "+a4);
		
		
	}

}

/*  ArrayList  :  dynamic array
 * 
   which implement list interface
   it is maintain insertion order
   it will allow duplicate value
   it is structure like a normal array
   it is support multiple methods
   iterator class -->  will help access data from any collection, hasNext(),next()
   
   addAll();  -->  existing Array list data want to copy the another ArrayList
             --> Add multiple element at a time
           
    set()-->  it will allow replace the element of specific condition
    
    get() -->   retrive element from list
          -->     fetch the data from particular indexing value
           
  collection.sort()--> // asending order
  collection.sort(a4.reverseorder())--> // desending order list
  
     remove()--->  it will allow remove element the arraylist
     removeAll()--->   it will remove all new element for collection
     index of()---> it will return integer index of that element from list
   */
