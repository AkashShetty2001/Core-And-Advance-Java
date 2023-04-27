/* Constructor
 *  it is a specialized setter. it is used to initialize data members of a class,
 *  it should be same as the class name.
 */

class Dog {
	private int cost;
	private String name;
	
	public Dog( int cost,String name)
	{
		//super(); by default there will be a super() present in every constructor..
		this.cost=cost;
		this.name=name;
	}
	
	/* super()
	 * it will make a call to a parent class constructor.
	 * 
	 * this()
	 * it will make a call to a same class constructor.
	 */
	
	//constructor overloading..
	/*public Dog( int cost)
	{
		
		this.cost=cost;
	}*/
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
	
	
}
public class ProgramsOnConstructor {
	public static void main(String args[])
	{
		Dog d = new Dog(10000,"Golden Retriver");
		//Dog d1 = new Dog(10000);
		System.out.println(d.getName());
		System.out.println(d.getCost());
		
		//System.out.println(d1.getCost());
		
	}

}
