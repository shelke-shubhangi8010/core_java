package loops;

public class Max_ArrayFind {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {10,20,30,40,50,60};
		int max=s[0];
		for(int i=1;i<s.length;i++) {
			if(s[i]>max) {		 
				max=s[i];
			}
		}
		System.out.println("maximum element is : " + max);
		 
		
	}

}
