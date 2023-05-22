package wrapperClasses.implictTypeCasting;
/*widening vs AutoBoxing */
public class Example1 {
		
	public static void methodOne(long l) { 
	System.out.println("widening"); 
	}
	
	public static void methodOne(Integer i) { 
	System.out.println("autoboxing"); 
	} 
	
	public static void main(String[] args) {
		int x=10;//Primitive value 
		methodOne(x);/*compiler will check for int argument,if not it will do type Casting(Implicit)
		              *Widening
		              */
	}
	
}
