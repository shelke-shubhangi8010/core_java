package constructor;

class Sample
{
	int id;
	String name;
	public Sample( int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	public void display(Sample obj) 
	{
			System.out.println("display method executed");
			System.out.println("Id  :"+id+"+"+name);
			
	}

    public void show()
    {     // this.display(10);
	     System.out.println("show method executed");
	     display(this);  //pass the argument  using this
     }

}

public class PassMethodArgument {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Sample s=new Sample(101,"shubhangi");   //object creation
      s.show();             // method calling


	}

}
