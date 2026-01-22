package oopsConcept;
    // assign value to variable
// set the object value in 
// initilize  the antribute current object
// its accept argument
class StudentTest{
	int id;
	String name;
	 double marks;
	public StudentTest(int i,String n,double m)   //constructor
	{
		id=i;
		name=n;
		marks =m;
		System.out.println("set the value");
	}
	
	public void display() {
		//System.out.println("ID :"+id+"  "+"name:"+name+" "marks:"+" marks");
	}
	
}
public class Default_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentTest t=new StudentTest(1,"anita",23.6);
	}

}
