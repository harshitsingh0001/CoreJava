package firstpackage;


   class Prac{
	private int id;
	private String name ;
	private int roll;
	
	// getter 
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	// setter method
	
	public void setId(int passId) {
		id=passId;
	}
	
	public void setName(String passName) {
		name=passName;
	}
	
	public void setRoll(int passRoll) {
		id=passRoll;
	}
	
}

class Encapsulation{
	public static void main(String [] args) {
		Prac obj=new Prac();
		obj.setId(10);
		obj.setName("Harshit");
		obj.setRoll(2);
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
	}
}