package Inner_Classes;

class Animal
{
	public void sound() 
	{
		System.out.println("Animal makes sound");
		
	}

}

public class Anonymous_Inner_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Animal a= new Animal()
         
         
         {     // anonymous class
        	 
        	    public void sound() 
        	    {
        	    	
        	    	System.out.println("Dog barks");
        	    }
        	 
        	 
         };
         a.sound();
         
	}

}
