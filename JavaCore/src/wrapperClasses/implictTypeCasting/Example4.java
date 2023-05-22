package wrapperClasses.implictTypeCasting;

public class Example4 {
	
		public static void methodOne(Long l) { 
		System.out.println("Long"); 
		} 
		
		public static void main(String[] args) { 
		int x=10; 
		//methodOne(x); //CE: can't find the method
		} 
		}
		/*
		Note: 
		Widening followed by Autoboxing is not allowed in java, but Autoboxing followed by
		widening is allowed.
		*/ 


