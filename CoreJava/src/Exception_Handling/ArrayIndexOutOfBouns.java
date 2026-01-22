package Exception_Handling;

public class ArrayIndexOutOfBouns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		int a[] = {10,20,30,40,50,60};
		System.out.println(a[7]);
    }
    catch(Exception  e) 
    {
    	System.out.println("Array index out of range");
    	
    }
    System.out.println("rest of code");
	}

}
