package Jagged_ragged_array;

public class Test_Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jaggedArr[][]= { {2,3,4,5},
				     {7,8},
				     {7,5,6,7}
				   };
		for(int i=0;i<jaggedArr.length;i++) 
		{
			for(int j=0;j<jaggedArr[i].length;j++) 
			{
				System.out.println(jaggedArr[i][j] +" ");
				
			}
			
			System.out.println();
		}
		
	}

}
