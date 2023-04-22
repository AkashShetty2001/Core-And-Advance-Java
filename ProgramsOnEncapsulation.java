

/*Q. How to achieve Encapsulation in java?
 * Ans. By using private members,setters and getters we can achieve Encapsulation.
 */

class Student {
	
	//if data members are private they can be accessed with the same class only..
	private int age;
	private String name;//since it is having all data members as private it is refereed as java Bean
	private String city;
	
	public void disp() {
	System.out.println(age);
	}

	/* Setters
	 *  Methods which accepts value from outside the class and give it to its
	 *  data members such methods are called as Setters.
	 */
	

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setcity(String city) {
		this.city=city;
	}
	
  /* Getters
   * Methods which returns the value of data memebrs outside the class such
   * methods are called as Getters
   */
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

}


public class ProgramsOnEncapsulation
{
	public static void main(String args[])
	{
		Student S = new Student();
		//S.disp();
		
		/* if data members are not private any one can access it by using the reference.
		    S.age=21;
			S.city="Banglore";
			S.name="Akash";
		
			System.out.println(S.age);
			System.out.println(S.name);
			System.out.println(S.city);
		*/
		
		S.setAge(21);
		S.setName("Akash");
		S.setcity("Banglore");
		
		System.out.println(S.getAge());
		System.out.println(S.getName());
		System.out.println(S.getCity());
	}

}
