package conditionalStatement;
import java.util.*;
public class trafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner("system.in");
		int light=1;
		
		System.out.println("1=Red,2=Yellow,3=Green");
		
		if(light==1)
		{
			System.out.println("Signal :"+light+"  Red-Stop!");
		}else if(light==2)
		{
			System.out.println("Signal :"+light+"  Yellow-Ready!");
		}
		else if(light==3)
		{
			System.out.println("Signal :"+light+"  Green-Go!");
		}else 
		{
			System.out.println("Invalid signal");
		}
	}

}
