package Basic;

public class C  extends P{

	int a=10;
public  void m1() {
	super.m1();
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		
		
C c1=new C();
	
	c1.m1();
	
	System.out.println(c1 instanceof P);
	
	System.out.println(c1 instanceof C);
	
	
	
	
	
	
	
	
		
	}

}
