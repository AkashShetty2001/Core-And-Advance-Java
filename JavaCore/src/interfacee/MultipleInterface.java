package interfacee;


/*one class can extend only one class at a time.

 * case 1: one class can implements any number of interface at a time.
 * case 2: class can extend as well as can implement a interface.
 * case 3: a class can extend a class and can implements any number of interfaces.
 * case 4: An interface can extend any number of interface at a time.
 */

/*========================================================*/


//case 1
/*interface IDemo1{
	void m1();
}

interface IDemo2{
	void m2();
}
class Demoimpl implements IDemo1,IDemo2{
	public void m1() {
		System.out.println("Inside m1");
	}
	public void m2() {
		System.out.println("Inside m2");
	}
}*/


/*===================================================*/


//case2
/*interface IDemo{
	void m1();
}
class Sample{
	public void m2() {
		System.out.println("inside m2");
	}
}
class Maain extends Sample implements IDemo{
	public void m1() {
		System.out.println("inside m1");
	}
}*/


/*=================================================================*/

/*case 3
interface IDemo1{
	void m1();
}
interface IDemo2{
	void m2();
}
class Sample{
	public void m3() {
		System.out.println("inside m3");
	}
}
class Maain extends Sample implements IDemo1,IDemo2{
	public void m1() {
		System.out.println("inside m1");
	}
	public void m2() {
		System.out.println("inside m2");
	}
}*/


/*======================================================*/


//case 4
interface IDemo11{
	void m1();
}
interface IDemo22{
	void m2();
}
interface IDemo33 extends IDemo11,IDemo22{
	void m3();
}

class Sampleimpl1 implements IDemo33{
	public void m1() {
		System.out.println("inside m1");
	}
	public void m2() {
		System.out.println("inside m2");
	}
	public void m3() {
		System.out.println("inside m3");
	}
}

public class MultipleInterface {
	public static void main(String[] args) {
		
		/*case 1
		 * Demoimpl obj1= new Demoimpl();
		 * obj1.m1();
		 * obj1.m2();
		 */
		
		/*case 2
		 * Maain obj2= new Maain();
	     * obj2.m1();
	     * obj2.m2();
		 */
		
		/*case 3
		 * Maain obj3= new Maain();
		 * obj3.m1();
		 * obj3.m2();
		 * obj3.m3();
		 */
		
		/*case 4
		 * Sampleimpl1 s= new Sampleimpl1();
		 * s.m1();
		 * s.m2();
		 * s.m3();
		 */
		
		}
		
	}






