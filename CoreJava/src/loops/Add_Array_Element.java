package loops;
public class Add_Array_Element {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int t[]= {10,26,30,40,67};
	int s[]	= {55,66,77,88,99};
	int size =t.length;
	int sum[] =new int[size]	;
	for(int i=0;i<size;i++) {
		sum[i]=t[i]=s[i];
	}
	System.out.println("Addition of Array element :")	;
		for(int a=0;a<size;a++ ){
			System.out.print(sum[a]  +" ");
		} 
	}
}
