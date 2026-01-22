package loops;
public class min_ArrayElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]= {11,27,39,40,58,60};
		int min=k[0];
		for(int a=1;a<k.length;a++) {
			if(k[a]<min)
			{
				min=k[a];
			}
		}
		System.out.println("Minimum element in array : "+ min);
	}
}
