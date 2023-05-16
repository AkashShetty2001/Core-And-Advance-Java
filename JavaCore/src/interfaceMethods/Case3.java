package interfaceMethods;


/*if 2 interfaces contain a method with same signature but with different return type,
 * Then it is not possible to implement both interfaces simultaneously.
 */

/*
interface One{
	void m1();
}

interface Two{
	int m1();
}

class Demoimpl implements One,Two{
	
	@Override
	public void m1() {
		System.out.println("Implementation given");
	}
	

	@Override
	public int m1() {
		System.out.println("Implementation given");
	}
	
}
public class Case3 {
	public static void main(String[] args) {
		Demoimpl d = new Demoimpl();
		d.m1();
	}

}


*/

/*
 * Results in compile Time errors.
 */


