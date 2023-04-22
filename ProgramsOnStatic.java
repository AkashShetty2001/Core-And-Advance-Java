
// usage of static variables, static block, and static methods in java...

// IMP key notes..
/* 1.Static elements do not depend on objects.
 * 2.usage of instance variables in static block,methods leads to CTE..
 * 3.Static blocks  are used to initialize static variables.
 * 4.static variables and static block will be executed automatically during class loading..
 */


//Simple console based Application to calculate Simple interest of Farmer loan..
import java.util.*;

class Farmer
{
	private float pa;// instance variables because keeps changing for every object..
	private float td;
	private float si;
	static private float ri;// static variable memory will allocated once in heap during class loading..
	                        // a copy of it will be used by every object..
	static {
		ri=2.5f;//static block to initialize static variable.
	}
	
	 public void input() {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter Principal Amount");
		pa=sc.nextFloat();
		System.out.println("Enter Time Duration"); 
		td=sc.nextFloat();
	}
	  
	  public void Compute() {
		  si=(pa*td*ri)/100;// Formula for si..
	  }
	  
	  public void Display() {
		  System.out.println("Simple interest is "+ si);
	  }
	
}


public class ProgramsOnStatic 
{
  public static void main(String args[])
	
	{
		Farmer f1 =new  Farmer();
		Farmer f2 =new  Farmer();
		f1.input();
		f1.Compute();
		f1.Display();
		
	}

}

