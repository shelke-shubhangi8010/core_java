package Interface;
interface Drawable
{
	public void draw();
	static int a=10;
	static int cube(int a) 
	{ 
		//static int b = 10;
	    int res= a*a*a;
	     System.out.println(res);
	     return res;
	     
	}
	
	
   default void show()
  {
	System.out.println("default method");

  }

}
class rectangle implements Drawable
{
	public void draw() 
	{
		System.out.println("drawing rectangle");
		
	}


}
public class Test_Static_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Drawable d=new rectangle();
      d.draw();
      d.show();
    System.out.println(Drawable.cube(10));
	}

}
