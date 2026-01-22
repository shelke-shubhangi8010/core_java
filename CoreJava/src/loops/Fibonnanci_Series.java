package loops;

public class Fibonnanci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0,num2=1,sum=0;
		int no=20;
		for(int i=2;i<=no;i++) {
			
			sum=num+num2;
			num=num2;
			num2=sum;
			System.out.print(sum + (" "));
		}
		
		
		
		
		
	}

}
