package Jagged_ragged_array;

class Product
{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price ) 
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

    public void show()
   {
    	System.out.println("Product id : "+id);
    	System.out.println("Product name : "+name);
    	System.out.println("Product Price : "+price);
   }
}
public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 /* Product p=new Product(111,"watch",1500);
		 p.show();  */ 
		
		// second way print the array
		
		
		Product p[] = new Product[5];
		p[0]= new  Product (111,"watch",1000);
		p[1]= new  Product (112,"laptop",1000);
		p[2]= new  Product (113,"mobile",1000);
		p[3]= new  Product (114,"tab",1000);
		p[4]= new  Product (115,"i phone",1000);
		
		p[0].show();
		System.out.println();
		p[1].show();
		System.out.println();
		p[2].show();
		System.out.println();
		p[3].show();
		
		//  using for loop
		
		
		for(int i=0;i<p.length;i++) 
		{
			p[i].show();
		}
		System.out.println();
		
		// using for each loop
		
		for(Product pr:p) 
		{
			pr.show();
		}
		
		
	}

}
