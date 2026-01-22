package loops;
import java.util.*;
public class Userdefine_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
System.out.println("Enter size of array");
int a[]=new int[4];
 
System.out.println("print the array element");
for(int i=0;i<4;i++) {
	
	a[i]=sc.nextInt();
}
	System.out.println("print the user define array")	;
		
		//for(int s :a) {
			
		//	System.out.println(s [i] +"");
		//}
		for(int i=0;i<a.length;i++) {
			//	System.out.println("print the array of element");
				System.out.println(a[i] +"");
			}
			
	}

}
