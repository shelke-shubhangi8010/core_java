package Block;

public class Instance_Initailsor_Block {

	int speed;
	public Instance_Initailsor_Block() 
	{
		System.out.println("Speed of truck is :"+speed);
		
	}
	// this block does not have a name 
	// assign data  of instance variable
	// first instance initalisor block executed  then 
	//instance initializer block  
	{
		speed=80;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Initailsor_Block t= new Instance_Initailsor_Block();
	}

}
