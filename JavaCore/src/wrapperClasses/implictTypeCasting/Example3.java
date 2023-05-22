package wrapperClasses.implictTypeCasting;
/*AutoBoxing vs Var-ard */
public class Example3 {
	
		
		public static void methodOne(Integer i) { 
		System.out.println("AutoBoxing"); 
		} 
		
		public static void methodOne(int... i) { 
		System.out.println("var-arg method"); 
		} 
		
		public static void main(String[] args) { 
		int x=10; 
		methodOne(x);
		}
		
}
