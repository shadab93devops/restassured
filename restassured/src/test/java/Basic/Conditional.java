package Basic;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=90;
		int b=50;
		int c=40;
		
		if(a>b) {
			System.out.println("A is greater then B");
		}
		else {
			System.out.println("B is greater then A");
		}
	
	
	
//	int max=a;
//	if(b>a && b>c ) {
//		max=b;
//	}
//	
//	else if(c>a && c>b) {
//		max =c;
//	}
//	
//	System.out.println(max);
	
	/*
	 * for(intiliaser;condition;increament){
	 * code
	 */

		
		
		
		
		for(int i=0;i<=5;i+=2) {
			System.out.println(i);
		}
		
		
		/*intializer
		 * while(condition){
		 * 
		 * code
		 * increment
		 * }
		 */
		
//		int i=1;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
		
		/*intiliazer
		 * do{
		 * code
		 * increment
		 * }
		 * while(condition)
		 */
		
		
//		int i=1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);
		
		
		
		
		Scanner input=new Scanner(System.in);
		
		
		char character = input.next().trim().charAt(0);
		
		if(character >='a' && character <='z') {
			System.out.println("lowercase");
		}
		else {
			System.out.println("uppercase");
		}

		
		
		
		
		
		
		
		
		
	}
	
}
