package interfaceMethods;

/*if 2 interfaces contain a method with same signature and same return type ,
 * then in the implementation class only one method implementation is enough.
 */

interface IDemo1{
	void m1();
}

interface IDemo2{
	void m1();
}

class Sampleimpl implements IDemo1,IDemo2{
	@Override
	public void m1() {
		System.out.println("Implementation given");
	}
}

public class Case1   {
	public static void main(String[] args) {
		IDemo1 d= new Sampleimpl();
		d.m1();
	}

}
