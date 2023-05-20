package wrapperClasses;

/*Constructors :
 * almost all the wrapperClasses have 2 constructors.
 * a.one taking primitive type.
 * b.one taking String type.
 * 
 * 
 * Byte: (byte and String)
 * Short: (short and string)
 * Integer: (int and string)
 * Long: (long and string)
 * Double: (double and string)
 * Boolean: (boolean and string)
 * Character: (character)
 * Float: (float,String and double)
 */
public class ConstructorForWrapperClasses {
	public static void main(String args[]) {
		
		Byte b1 = new  Byte((byte) 10);
		System.out.println(b1);
		Byte b2 = new  Byte("10");
		System.out.println(b2);
		/*Byte b3 = new  Byte("ten");//NumberFormatExecption..
		 *System.out.println(b3);
		*/
		
		/*same for Short,Long,Integer,Double*/
		
		/*String Arguments*/
		Boolean a1 = new Boolean("True");
		System.out.println(a1);
		Boolean a2 = new Boolean("sachin");
		System.out.println(a2);
		Boolean a3 = new Boolean("FALSE");
		System.out.println(a3);
		
		Boolean a4 = new Boolean(true);
		System.out.println(a4);
		
		
		Character c1 = new Character('a');
		System.out.println(c1);
		
		
		
	}

}
