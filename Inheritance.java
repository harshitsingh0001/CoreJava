package firstpackage;

class shape {
	
	void show() {
	System.out.println("i am in shape class");
	}
}


class Triangle extends shape{
	
	void show() {
	System.out.println("i ma in triangle shape");
	}
	void details() {
		System.out.println("im in Traianglr");
	}
}





public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new Triangle(); // upcasting
	    	Triangle triangle=(Triangle)s;
	    	triangle.details();
	}

}
