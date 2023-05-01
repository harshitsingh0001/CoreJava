package firstpackage;

class Keyword{
	
    static class Inner{
    	int a=20;
    	int c=20;
    }
	int a;
	int b;
	
	public Keyword(int a,int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		
		System.out.println(a);
		System.out.println(b);
	}
	 
    
	
}


public class UseOfKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyword keyword=new Keyword(10,20);
        System.out.println(keyword.a);
        System.out.println("use of instanceof");
        
        System.out.println(keyword instanceof Keyword);
         
	}

}
