package Practice_Example_Oops_Concept;
class father
{
	public void  name() 
	{
		System.out.println("My father name is balasaheb");
	}
}
class mother extends father
{
	public void  woman() 
	{
		System.out.println("my mother is super woman");
	}
}
class sister extends mother
{
	public void corporate_girl() 
	{
		System.out.println("my sister are corporate girl");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sister s=new sister();
       s.corporate_girl();
       s.woman();
       s.name();
	}

}
