package firstpackage;

class Mobile{
	void showDetails() {
		System.out.println("inside parent class");
	}
}

class vivo extends Mobile{
	void showDetails() {
		System.out.println("vivo price is 20k");
	}
}

class Samsung extends Mobile{
	void showDetails() {
		System.out.println("Samsung price is 30k");
	}
}

class Apple extends Mobile{
	void showDetails() {
		System.out.println("Apple price is 200k");
	}
}


public class Polymorphism {
	public static void main(String [] args) {
		Mobile m1=new vivo();//upcasting
		Mobile m2=new Samsung();
		Mobile m3=new Apple();
		Samsung samsung= (Samsung)m2;
		samsung.showDetails();
		m1.showDetails();
		m2.showDetails();
		m3.showDetails();
	}

}
