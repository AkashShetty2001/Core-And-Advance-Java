 //Q. Can we have Constructor with in a Abstract Class
// ans. Yes

abstract class demo1 {
	// zero parameterized constructor
	demo1()	{
		System.out.println("constructor with in a abstract class");
	}
}
class demo2 extends demo1 {
	//by Default JVM will include zero parameterized constructor
	/*     demo2()
	 *  {
	 *    super()//it will make a call to a parent class Constructor..
	  
	    }   
	 */
}

public class ConstructorInAbstractClass
{
	public static void main(String args[])
	{
		demo2 d= new demo2();//will invoke zero parameterized constructor..
	}

}

/* Expected output..
   Constructor present in the parent class will get executed..*/

