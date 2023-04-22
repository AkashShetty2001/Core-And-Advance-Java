// Program to count No of Objects created..

class Demo {
	int a;
	int b;
	static int count;
	
	//java block will be include by every constructor with the same class..
	{
		count++;
		//System.out.println("Constructor included..");//java Block
	}
	
	Demo()
	{
		
	}
	
	Demo(int a)
	{
		this.a=a; // this keyword is used to refer the current Object..
	}
	
	Demo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
public class CountObjects {
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo(10);
		Demo d3 = new Demo(20,30);
		System.out.println(Demo.count);
		
		
	}

}

/*   Expected output
 *   3
 */
