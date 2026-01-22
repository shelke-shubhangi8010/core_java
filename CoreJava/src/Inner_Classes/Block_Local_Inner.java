package Inner_Classes;

public class Block_Local_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Ram";
		{             // instance initalisor block
			   
			class Test
			{
				
				public void Display() 
				{
					System.out.println("name is :" +name);
			    }
				
				
		     }
			  Test t= new Test();
			  t.Display();
		   
		}
	}

}
