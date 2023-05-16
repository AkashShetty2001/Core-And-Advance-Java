package interfaceMethods;


/*if 2 interfaces contain a method with same name but with different Arguments,
 * Then implementation class will have to provide implementation for both the methods.
 * and these methods acts as a Overload Methods.
 */

interface ISample1{
	void m1();
}

interface ISample2{
	void m1(int i);
}

class Testimpl implements ISample1,ISample2{
	
	@Override
	public void m1() {
		System.out.println("Implementation given for m1()");
	}
	@Override
	public void m1(int i) {
		System.out.println("Implementation given for m1(int i)");
	}
}

public class Case2 {
	public static void main(String[] args) {
		Testimpl d= new Testimpl();
		d.m1();
		d.m1(8);
	}

}


