package variableArgumentMethods;

/*
 * Var arg method
==============
 It stands for variable argument methods.
 In java language,if we have variable no of arguments, then compulsorily new 
method has to be written till jdk1.4.
 But jdk1.5 version, we can write single method which can handle variable no of 
arguments(but all of them should be of same type).
 Syntax:: methodOne(dataType... varaibleName)
 ... => It stands for ellipse

 */

class Demo1{
	//Method overloding from jdk1.4
	public void add() {
		System.out.println("no arguments");
	}
	public void add(int a) {
		System.out.println("1 arguments");
	}
	public void add(int a,int b) {
		System.out.println("2 arguments");
	}
	public void add(int a,int b,int c) {
		System.out.println("3 arguments");
	}
}

class Demo
{
//JDK1.5V called Var-args(ellipse)
	
		public void add(int... x){
		System.out.println("var-arg approach");
		}
}

public class Example1 {
	public static void main(String...  args) {
		Demo1 d1 =new Demo1();
		d1.add();
		d1.add(10);
		d1.add(1, 2);
		d1.add(1,2 ,3 );
		Demo d =new Demo();
		d.add();
		d.add(10);
		d.add(10,20);
		d.add(10,20,30);
		}
	
	/*Note:: internally the var arg method will converted to SingleDimension Array, so we
	can access the var arg method arguments using index.*/
}


		
		
		

		
