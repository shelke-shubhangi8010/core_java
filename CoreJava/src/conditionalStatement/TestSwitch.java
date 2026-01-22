package conditionalStatement;
import java.util.*;
public class TestSwitch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st and 2nd number");
int num1= s.nextInt(),num2=s.nextInt();

System.out.println("Enter choice: ");
int ch = s.nextInt();
   switch(ch)
   {
   case 1:
	   System.out.println("Addition:"+(num1+num2));
     break;
   
   case 2:
	   System.out.println("Division:"+(num1/num2));
     break;
   
   case 3:
	   System.out.println("Substraction:"+(num1-num2));
     break;
   
   case 4:
	   System.out.println("Multiplication:"+(num1*num2));
     break;
   
   
   case 5:
	   System.out.println("Addition:"+(num1+num2));
     break;
   
   case 6:
	   System.out.println("Addition:"+(num1+num2));
     break;
   
   case 7:
	   System.out.println("Modulus:"+(num1%num2));
     break;
   
   default:
	   System.out.println("Invalid chhoice");
   }

	}

}
