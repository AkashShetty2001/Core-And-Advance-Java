package wrapperClasses;

/* IMP Classes..
 * Q.can we create our Own immutable Classes.
 * Ans ,Yes
 * Immutable Class:
 * 		If we create an Object of Immutable Class and try to make any changes to that Object,
 * 		the changes are reflected in the new object not the Existing object..
 */



class Test{
	int i;
	 public Test(int i) {
		 this.i=i;
	 }
	 public Test modify(int i) {
		 if(this.i==i)
			 return this;
		 else
			 return new Test(i);
				 
		 }
	 }

public class CreatingOwnImmutableClass {
	public static void main(String[] args) {
		Test t1 = new Test(10);
		System.out.println(t1.hashCode());
		Test t2 = t1.modify(10);
		System.out.println(t2.hashCode());
		Test t3 =t1.modify(100);
		System.out.println(t3.hashCode());
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
	}

}
