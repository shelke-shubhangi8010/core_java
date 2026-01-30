package Collection;
import java.util.Vector;
public class Vector_Demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Vector<String> v1=new Vector<String>();
		
		v1.add("Tiago");
		v1.add("Altroz");
		v1.add("Harrier");
		v1.add("Curve");
		System.out.println(v1);
		
		v1.addElement("Sierra");
		System.out.println("Adding Element :"+v1);
		
	System.out.println("retrive First Element :"+v1.firstElement());
	System.out.println("retrive Last Element :"+v1.lastElement());
	System.out.println("randome number :"+v1.elements());
	System.out.println("Retrive specific element :"+ v1.elementAt(2));
	System.out.println("remove Element :"+v1.remove(2));
	
	v1.removeElementAt(2);
	System.out.println(v1);
	
	
	}

}




/*
 * vector is Syncronized---> thread safe environment
 *  ArrayList    -->      non Synchronized ----> non thread safe environment
 * 
 * lagacy classes --> lagacy method
 * 
 * methods --->
 * 
 * addElement() --> it will add element into vector
 * firstElement ()---> retrive first element in vector
 * lastElement()---> retrive last element in vector
 * removeElementAt(index)--->  remove element are specific index  
 * removeElement(indexing value) --->last element
 * 
 * 
 * get(),size(), cone(),remove(),sublist(), toArray()
 * */
 */