package wrapperClasses;

/*To convet..
 * Primitive Type/String->wrapper object(.valueOf())
 *public static java.lang.Wrapper valueOf(java.lang.String, int) throws java.lang.NumberFormatException;
  public static java.lang.Wrapper valueOf(java.lang.String) throws java.lang.NumberFormatException;
  public static java.lang.Wrapper valueOf(int);
  this method is in almost all the wrapper classes.
 */
public class wrapperClassMethods {
	public static void main(String[] args) {
		Integer i1 =Integer.valueOf(10);
		System.out.println(i1);
		Integer i2 =Integer.valueOf("10");
		System.out.println(i2);
		/*Integer i3 =Integer.valueOf("ten"); NumberFormatException..
		System.out.println(i3);*/
		Integer i4 =Integer.valueOf("1111",2);//2nd argument is basically a radix.
		System.out.println(i4);
		
		
		/*Max and Min values of radix..*/
		System.out.println("Max :"+Character.MAX_RADIX);
		System.out.println("Min :"+Character.MIN_RADIX);
		
		/*For character we have to pass character itself*/
		Character c1 = Character.valueOf('a');
		System.out.println(c1);
		

        /*To convet..
		 * wrapper object -> Primitive(.xxxValue())
		 * public byte byteValue();
  			public short shortValue();
  		    public int intValue();
			public long longValue();
			public float floatValue();
			public double doubleValue();
		 */
		
		Integer i = new Integer(130);
		System.out.println(i);//object
		int a = i.intValue();
		System.out.println(a);//primitive
		
		
		Character c = new Character('a');
		System.out.println(c);//Object
		char b = c.charValue();
		System.out.println(b);//primitive
		
		
		Boolean  b1 = new Boolean("true");
		System.out.println(b1);//object
		boolean b2 =b1.booleanValue();
		System.out.println(b2);//primitive
		
		/*To convet..
		 * wrapper object/Primitive -> String(.toString())
		 *  public java.lang.String toString();
		 */
		
		String s1 =Integer.toString(10);//Integer Object to String
		System.out.println(s1);
		
		String s2 = Float.toString(10.5f);//Float Object to String
		System.out.println(s2);
		
		
		/*To convet..
		 * String -> Primitive(.parseInt())
		 *   public static int parseInt(java.lang.String, int) throws java.lang.NumberFormatException;
  			public static int parseInt(java.lang.CharSequence, int, int, int) throws java.lang.NumberFormatException;
  			public static int parseInt(java.lang.String) throws java.lang.NumberFormatException;
		 */
		
		int x =Integer.parseInt("10");//String to int
		System.out.println(x);//int
		
		double d =Double.parseDouble("11.5");
		System.out.println(d);
		
		
	}

}
