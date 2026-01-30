package Collection;

import java.util.LinkedList;

public class Linked_List_Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		LinkedList<String> l1 =new LinkedList<String>();
		l1.add("History");
		l1.add("science");
		l1.add("math");
		l1.add("English");
		l1.add("Hindi");
		
		System.out.println("Print the List :"+l1);
		
		l1.addFirst("Akanksha");
		System.out.println("Add element at first position  :"+l1);
		
		l1.addLast("Akshay");
		System.out.println("Add element at last position :"+l1);
		
		l1.push("Akash");
		System.out.println("push  element At First position : "+l1);
	
		l1.offer("Anvi");
		System.out.println("Add the elements : "+l1);
		
		l1.offerLast("Akashada");
		System.out.println("Add element of last position : "+l1);
	
	    l1.get(5);
		System.out.println(" retrive elemment at particular index : "+l1);
	
	
	}

}
// Methods in Linked list

/* addFirst() -->  add element at 1st position
 * addLast() -->   add element at last position
 * push()   -->   add element 1st
 * 
 * 
 * offer()  --> add the elements
 * offerLast()--->  add element at last position
 * get()--->   retrive elemment   at perticular index  // indexing value
 * getLast()  ---> only retrive last element
 * getFirst()--->  only retrive frst element
 * 
 * peek()---> return first element
 * peekFirst()----> null
 * peekLst()----> return last element
 * 
 * remove()----> it remove first Element
 * remove(indexing value)---> remove element are specific index
 * removeFirst()---> remove first element // poolFirst()
 * remove Last()----> remove last // poolLast()
 * 
 * */
 */