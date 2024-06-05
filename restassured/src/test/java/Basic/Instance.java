package Basic;

public class Instance {
	
	
	
	/*Instance Block
	 * use for logic and intilization of instance variable
	 * no of object =no of instance block executed
	 * nultiple instance bolock can be there
	 * firt instance block is executed then constructor
	 * memory allocated during obj creation
	 */
	
	int i;
	
	void m1() {
		System.out.println(i);
	}
	
	Instance(){
	
		
		System.out.println("no-args");
	}
	
	
	
	;
	
	
	

	
	
	
	{
		System.out.println("second instance block");
	}
	{
		
		
		i=10;
		System.out.println("instance blocks");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Instance c=new Instance();
		
		c.m1();
		
		
	}

}
