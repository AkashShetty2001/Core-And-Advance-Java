package wrapperClasses;

/*Wrapper classes are used to wrap primitives into objects.
 * so that we can handle primitives just like an Objects.
 * and to define utility functions to them.
 * 
 * WrapperClasses are Byte,Short,Integer,Long,Float,Double(Immediate parent Number).
 *                    Character,Boolean(Immediate parent Object).
 *                    
 * WrapperClasses are Immutable class..
 */
public class Example1 {
	public static void main(String[] args) {
		 int i = 10;
		 System.out.println(i);
		 /* No utility functions is available for Primitives*/
		 
		 Integer a = new Integer(10);
		 System.out.println(a);
		 a.toString();
		 /*.toString() is overriden to print the content of the object.. 
		 /*a.(....)
		  * Utility functions are available for an wrapper class..
		  */
		 
	}

}
