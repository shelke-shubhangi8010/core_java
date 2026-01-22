package Static_Keyword;

// static variable maintain state of data
//  common data of all object of class
// only one time memory allocate




public class TestStaticVariable {
    int id;
    String name;
    static String Company="ABC";
    public TestStaticVariable(int id,String name) 
    {
    this.id=id;
    	this.name=name;
    }
    
    public void show()
    {
    	  System.out.println("Name of employee :"+name);
    	  
    	  System.out.println("Id of employee :"+id);
    	  System.out.println("name of coompany :"+Company);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStaticVariable t = new TestStaticVariable(101,"siya");
		t.show();
		TestStaticVariable  t1 = new TestStaticVariable(102,"joy");
		t1.show();
	}

}
