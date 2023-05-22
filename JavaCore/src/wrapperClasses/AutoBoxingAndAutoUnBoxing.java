package wrapperClasses;


public class AutoBoxingAndAutoUnBoxing {
	public static void main(String[] args) {
		
		/*Autoboxing
         =========
 		Automatic conversion of primtive type to wrapper object by the compiler is called
		"AutoBoxing".
		*/
		
		Integer i = 10;
		System.out.println(i);
		
		
		
		/*AutoUnBoxing
		============
 		Automatic conversion of wrapper object to primtive type by compiler is called 
		"AutoUnBoxing".
		*/
		
		Integer i1=20;//AutoBoxing
		int i2=i1;
		System.out.println(i1);//Wrapper Object
		System.out.println(i2);//Primitive type
		
		

	}

}
