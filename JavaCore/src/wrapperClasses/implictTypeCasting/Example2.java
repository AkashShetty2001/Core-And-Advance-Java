package wrapperClasses.implictTypeCasting;
/*widening vs var-arg*/
public class Example2 {
	
	public static void methodOne(byte l) { 
	System.out.println("widening"); 
	} 
	public static void methodOne(long l) { 
		System.out.println("Widening"); 
		} 
	public static void methodOne(Integer l) { 
		System.out.println("autoBoxing"); 
		} 
	public static void methodOne(int... i) { 
	System.out.println("var-arg method"); 
	} 
	
	public static void main(String[] args) {
		int x=10; 
		 methodOne(x); 
		 /*compiler first searches for the method which is accepting int argument,
		  * if not it will done autoBoxing if possible,otherse the var-arg method will be called.
		  */
	}
	
}
