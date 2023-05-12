package innerClasses;

/*Q: can we have Inner Class in Java?
 * yes 
 */


//Non static InnerClass..
class A{
	public void show() {
		System.out.println("inside class A");
	}
	
	class B{
		public void show() {
			System.out.println("inside class B");
		}
		
	}
}
public class NonStaticinnerClass {
	public static void main(String[] args) {
		//creating an object of A class
		A obj= new A();
		 obj.show();
		 
	    //creating an object of B class
		 A.B obj1;//since B is inside Class A object of class a is used as reference.
		 obj1=obj.new B();
		 obj1.show();
		 	
	}

}
