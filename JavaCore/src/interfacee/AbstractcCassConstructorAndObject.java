package interfacee;

/*Q1 . can abstract class object be created.?
 * Ans.No
 * 
 * Q2. can Abstract class contain a Constructor?
 * Ans.Yes,abstract class can contain contructor beacuse this can be implemented by a child class.
 * and this class may need the data members of abstract class so constructor is present 
 * to initialize them..
 * 
 * Q3.can a reference type  be created for an abstract class?
 * Ans , yes 
 * 
 */

 abstract class Demo
 {
	abstract void m1() ;
 }
 
    abstract class Person{
	 String name;
	 Integer age;
	 Float height;
	 
	public Person(String name, Integer age, Float height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	 
	 
 }
  
  class Student extends Person{
	  Integer sid;
	  Float marks;
	  String courseName;
	public Student(String name, Integer age, Float height, Integer sid, Float marks, String courseName) {
		super(name, age, height);
		this.sid = sid;
		this.marks = marks;
		this.courseName = courseName;
	}
	  public void stuDetails() {
		  System.out.println("Student details......");
		  System.out.println("======================");
		  System.out.println("name :"+ name);
		  System.out.println("age :"+ age);
		  System.out.println("height :"+ height);
		  System.out.println("sid :"+ sid);
		  System.out.println("marks:"+ marks);
		  System.out.println("courseName:"+ courseName);
		  
		 
	  }
  }
 
public class AbstractcCassConstructorAndObject {
	public static void main(String[] args) {
		
		//Q1.
		//Demo d = new Demo();
		/*Cannot instantiate the Abstract class demo  .*/
		
		//Q2. and Q3.
		Person s = new Student("Akash", 21, 5.10f,400,90.0f,"Java");
		((Student) s).stuDetails();
	}

}
