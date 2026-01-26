package String_Methods;

public class Difference_builder_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime=System.currentTimeMillis();
		StringBuffer  sb=new StringBuffer();
		
		for(int i=0;i<10000;i++) 
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime));
		
		 startTime=System.currentTimeMillis();
		StringBuilder  sb1=new StringBuilder();
		
		for(int i=0;i<10000;i++) 
		{
			sb1.append("is easy");
		}
		System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis()-startTime));
		
	}

}
