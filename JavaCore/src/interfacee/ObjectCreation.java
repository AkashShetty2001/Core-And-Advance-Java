package interfacee;

//import java.lang.instrument.Instrumentation;
/*Q During the creation of a child Object it will it create a parent object..?
 * 
 * Ans.no ,only child class object is created..
 * one object(child) created . and 2 constructors are called...
*/


class Parent{
	Parent(){
		System.out.println("Parent class Constructor");
		System.out.println(this.hashCode());
		System.out.println();
		
		/* this.hashCode():
		 *  it is an object class method,it prints the address of an object... 
		 */
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child class Constructor");
		System.out.println(this.hashCode());
		
	}
	/*public static long getObjectsize(Object o) {
		return instrumentation.getObjectSize(o);
	}*/
	
}
public class ObjectCreation {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.hashCode());
		
	}

}

/*conclusion :
 * During the child class object creation,only the child class object is create.
 * but not the parent Object,still parent class constructor is called duw to super()
 * present inside the child class constructor..
 * parent class constructor is called to bring the properties of parent to child. 
 */


