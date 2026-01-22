package loops;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50,60};
	      // System.out.print(a[3]);
	       
	       
			for(int i=0; i<a.length;i++) {
				
				System.out.print(a[i] +" ");
			}
			System.out.println();
			System.out.println("after reversing array");
		
		for(int j=a.length-1;j>=0;j--) {
			
			System.out.print(a[j] +" " );
		}
		
	}

}
