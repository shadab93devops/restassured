package Basic;

public class Constructor  extends Variables{
	
	
/*constructor:
 * it is use to intiliaze the object;
 * it is executed after object is created
 * every class will have constructor
 * if user dont define then default constructor is created by complier
 * default constructor will have same modifier as class modifer
 * modifer for constructor can be public,default,protected,private
 * super(), this() are use to call constructor
 * should be in first line
 * both cannot be use simultaniously
 * are always use in constructor
 * super()-> to call parent constructor
 * this()-> to call child constructor
 * 
 * 
 * 
 * super,this -> are key words which are used to refer current and parent class instance variable
 * can be multiple
 * cannot be used in static area
 * 
 * 
 * CONSTRUCTOR CAN BE ONERLOADED
 * 
 * constructor cannot be overridedd and inheritate
 * constructor can be there in interface .as interface dont consists of non static variable so constructor do exist
 * in abstract class constructor can be there
 * 
 * 
 */
	
	
	
	
	
	
	Constructor(int i){
		
	System.out.println("int");
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c= new Constructor(10);
		
		
	}

}
