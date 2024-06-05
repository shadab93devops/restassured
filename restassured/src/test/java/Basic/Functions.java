package Basic;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String greet=name();
System.out.println(greet);

int ans=sum1(50,20);
System.out.println(ans);
	}
	
	
	static void greet() {
		System.out.println("hello theer");
	}
	
	static int sum() {
		int a=20;
		int b=20;
		int sum=a + b;
		return sum;
	}
	
	static String name() {
		return "hey all , bee happy always";
	}
	
	
	
	static int sum1(int a, int b) {
		int sum= a+b;
		return sum;
	}

}
