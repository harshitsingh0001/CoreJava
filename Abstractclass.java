package firstpackage;


abstract class StudentDetails{
	
	public StudentDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("inside constructor");
	}
	static  int id=10;
    static   int roll=2;
      String name="Harshit";
      
      abstract void showDetails();
      
      static void add() {
    	  System.out.println(id+roll);
      }
}


class Student1 extends StudentDetails{
	void showDetails() {
		System.out.println(id);
		System.out.println(roll);
		System.out.println(name);
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 student=new Student1();
		student.showDetails();
		 

	}

}
