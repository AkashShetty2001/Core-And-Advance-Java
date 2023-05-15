package interfacee;


interface ISample{
	void m1();
	void m2();
}

 abstract class SampleImpl implements ISample {
	@Override
	public void m1() {
		System.out.println("Implementation given to m1()");
	}
}
 
 class SubSampleImpl extends SampleImpl {
	 @Override
	 public void m2() {
			System.out.println("Implementation given to m2()");
	 }
 }
public class InterfaceProgram {
	public static void main(String[] args) {
		ISample sample = new SubSampleImpl();
		sample.m1();
		sample.m2();
	}

}
