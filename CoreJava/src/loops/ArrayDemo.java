package loops;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {10,20,30,40,50,60};
       System.out.println(a[3]);
		
       
       //for loop using
       
		System.out.println();
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i] +" ");
		}
		
		System.out.println();
		String fruits[] = {"Apple","Banana","orange","cherry"};
		for(int i=0;i<fruits.length;i++) {
			System.out.print(fruits[i] +" ");
		}
		System.out.println();
		//using for each loop
		
		System.out.println("Using For Each loop");
		
		
		for(String f:fruits) {
			
			System.out.print(f +" ");
		}
		
		
	}

}
