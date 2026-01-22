package inheritance;
class employee          // Multilevel inheritance
{   public void EmployeeSalary() 
	{
		System .out.println("Employee salary is transfer to account");
	}
}
class Manager extends employee
{
	public void leadership()
	{
		System.out.println("Manager is very Strict");
	}
}
class Staff extends Manager
{
	public void showBusiness() 
	{
		System.out.println("Business : Mobile shop");
	}
}
 public class Demo_Multilevel_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Staff p1=new Staff() ;
       p1.EmployeeSalary();
	   p1.leadership();
	   p1.showBusiness();
	}
}
