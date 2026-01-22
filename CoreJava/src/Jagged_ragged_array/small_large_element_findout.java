package Jagged_ragged_array;

public class small_large_element_findout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int a[]= {10,20,30,50,60,70};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
				System.out.println(max);
			}
			else if(a[i]<min) 
				{
					min=a[i];
				
				System.out.println(min);
				}
			else {
				System.out.println("no not found");
			}
			
			//System.out.println("Smallest no:"+min +"Largest no:"+max);
		}
		
		
	}

}
