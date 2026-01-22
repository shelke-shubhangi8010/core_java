package loops;
import java.util.*;
public class UserDefine_Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the array element");
		
		float a[]= new  float[7];
		
		//System.out.println("Print the array element");
		
		for(int i=0 ;i<7;i++) {
			
			a[i]=sc.nextFloat();
			//System.out.println(a[i]);
		}
		System.out.println("print the array of element");
		for(int i=0;i<a.length;i++) {
		//	System.out.println("print the array of element");
			System.out.println(a[i] +"");
		}
		
		
	}

}
