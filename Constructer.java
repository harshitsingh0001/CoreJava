package firstpackage;



class First {
	int a;
	int b;
	int d;
	int c;
	First(int a,int b){
       this.a=a;
       this.b=b;
	}
	
	First(First s){
		c=s.a;
		d=s.b;
	}
	
	
	void display() {
		System.out.println(c);
		System.out.println(d);
	}
}
public class Constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First first=new First(10,20);
		First first2=new First(first); 
		first2.display();

	}

}
