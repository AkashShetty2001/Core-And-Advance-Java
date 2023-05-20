package interfaceVariables;

/*Adapter class are design patterns allowed to slove the problem of 
 * direct implemention of interface methods.
 */


interface x{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}

/*Adpater classes are abstract so that object cant be created.*/

abstract  class Adapterx implements x{
	public void m1() {
		
	}
	public void m2() {
		
	}
	public void m3() {
	
	}
	public void m4() {
	
	}
	public void m5() {
	
	}
}

class Demo extends Adapterx{
	public void m1() {
		System.out.println("implementation given");
	}
}

public class AdapterClass {
	public static void main(String[] args) {
		Demo d= new Demo();
		d.m1();
		
	
	}

}
