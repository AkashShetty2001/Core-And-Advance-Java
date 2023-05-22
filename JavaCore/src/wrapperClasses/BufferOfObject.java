package wrapperClasses;
/*Note: 
 * 
1. To implement autoboxing concpet in wrapper class a buffer of object will be 
created at the time of class loading.
2. During AutoBoxing,if an object has to be created first jvm will check whether 
the object is already available inside buffer
 or not.
3. If it is available, then JVM will reuse the buffered object instead of creating 
a new Object.
4. If the Object is not available inside buffer, then jvm will create a new object 
in the heap area, this approach improves the
 performance and memory utilization
 */


/*But this buffer concept is applicable only for few cases
1. Byte => -128 to +127
2. Short => -128 to +127
3. Integer=> -128 to +127
4. Long => -128 to +127
5. Character => 0 to 127
6. Boolean => true,false 
In the remaining cases new object will be created.
*/
public class BufferOfObject {
	public static void main(String[] args) {
		
		    //Case3 :
			Integer i1 = 10;//AutoBoxing
			Integer i2 = i1;
			i1++; // i1 = i1+1
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i1==i2);
			
			//Case4:
			Integer x = new Integer(10);
			Integer y = new Integer(10);
			System.out.println(x == y);//Sice new is used different object in heap.
			
			
			//Case5:
			Integer a = new Integer(10);//memory from heap area
			Integer b = 10;//AutoBoxing ===> Integer y = Integer.valueOf(10);
			System.out.println(a == b);//false
			
			//Case6:
			Integer c = new Integer(10);
			Integer d = c; //===> reference is reused so pointing to same object
			System.out.println(d == c);//true
			
			//Case7:
			Integer x1 = 10;
			Integer y1 = 10;
			System.out.println(x1 == y1);//true
			Integer a1 = 100;
			Integer b1 = 100;
			System.out.println(a1 == b1);//true
			Integer i = 1000;
			Integer j = 1000;
			System.out.println(i == j);//false

	}

}
