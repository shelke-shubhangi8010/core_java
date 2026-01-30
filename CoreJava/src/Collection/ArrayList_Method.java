package Collection;

import java.util.ArrayList;

public class ArrayList_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 =new ArrayList();
	       a1.add(101);
	       a1.add("Ram");
	       a1.add(103);
	       a1.add("Male");
	       a1.add(96);
	       
	       System.out.println("original list "+a1);
	       System.out.println("index of 103 in Arraylist "+a1.indexOf(2));
	       
	       System.out.println(" 96 is available in arraylist  : "+a1.contains(96));
	       
	       System.out.println(" 91 is not available in arraylist   : "+a1.contains(91));
	       
	       a1.clear();   //  delete all the data but structure[] is as it is
	       System.out.println("Clearly element from Arraylist : " +a1);
	       
	}

}
/*
*  ArrayList  :  dynamic array
* 
  which implement list interface
  it is maintain insertion order
  it will allow duplicate value
  it is structure like a normal array
  it is support multiple methods
  iterator class -->  will help access data from any collection, hasNext(),next()
  
  add() --->
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
    contains()--->  cheak element is part of collection or not--> true false
    clear() ---> All element deleted in arraylist but list is still there  []
    
    explore method
    
    isEmpty()--> check data preset or not collection
    lastindexOf()-->  return index of last element from list
    toArray()---> convert to fix size(array list to normal Array)
    subList()-->substring, , 5 list--> 3 list created
    size()---> find how many element are present in collection
    clone()---> create a exact same copy of list
    
    
  */
