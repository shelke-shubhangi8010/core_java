package inheritance;

public class OverLoadDemo {
   void show()
   {
	  System.out.println("welcome to overloading"); 
   }
   
   void show(String name)
   {
	   System.out.println(name+"welcome over loading");
   }
   void show(String name,String city) {
	   System.out.println(name+"welcome to overloading from"+city);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadDemo d1=new    OverLoadDemo();
		d1.show();
		d1.show("shubhangi");
		d1.show("Shubhangi","pune");
	}

}
