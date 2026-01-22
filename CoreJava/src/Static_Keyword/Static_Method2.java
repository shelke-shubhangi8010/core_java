package Static_Keyword;

class calculate
{
	static int cube(int c)
	{
		return c*c*c;
	}
}
public class Static_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  res =  calculate.cube(5);
System.out.println(res);
	}

}
