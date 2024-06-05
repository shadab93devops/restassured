package Basic;

import org.testng.annotations.Test;

public class Dependencies {

	
	@Test(groups= {"sanity"})
	void A() {
		System.out.println("a");
	}
	
	@Test(groups= {"sanity"})
	void B() {
		System.out.println("b");
	}
	
	
	@Test(groups= {"sanity"})
	void C() {
		System.out.println("c");
	}
	
	
	@Test(groups= {"regresion"})
	void D() {
		System.out.println("d");
	}
	
	
	
}
