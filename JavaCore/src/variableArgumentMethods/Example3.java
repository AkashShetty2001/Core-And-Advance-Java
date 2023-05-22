package variableArgumentMethods;
/*2D Array using Var-Arg approach*/
public class Example3 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,0};
		t.m1(a,b);
		
	}

}

class Test1{
	public void m1(int[]... x) {
		for(int[] data:x) {
			for(int element:data) {
				System.out.print(element);
			}
			System.out.println();
		}
		
	}
}
/*In the above program x is treated as 2D array*/
