package wrapperClasses.implictTypeCasting;

public class Example5 {
	
		public static void methodOne(Object o) { 
		System.out.println("Object"); 
		} 
		
		public static void main(String[] args) { 
		int x=10; 
		 methodOne(x);
		 /*Autoboxing is done then windening*/
		 /*parent  reference can hold child object*/
		}
}
		

