package variableArgumentMethods;

public class Example2 {
	public static void main(String[] args) {
		/*case5
		=====
		 We can overload var arg method, but var arg method will get a call only if none of
		matches are found.
		 (just like default statement of switch case)
		eg::*/
		
		 
		
		Test t= new Test();
		 t.methodOne(10);//Int arg method
		 t.methodOne();//Var arg method
		 t.methodOne(10,20,30);//Var arg method
		 }
		 } 


class Test
{
	public void methodOne(int ...i){
	System.out.println("Var arg method");
	}
	public void methodOne(int i){
		System.out.println("Int arg method");
	}
}
	


