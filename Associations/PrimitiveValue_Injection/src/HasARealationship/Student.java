package HasARealationship;

//Primitive value/Objects Injection.

/*Dependency injection can be achieved in 2 ways
 * a.constructor Dependency injection 
 * b.Setters Dependency Injection
 */

public class Student {
	//instance variables
	private String sname;
	private Integer sage;
	private Integer sid;
	
	//a.constructor Dependency injection 
	public Student(String sname,Integer sage,Integer sid) {
		super();
		this.sname=sname;
		this.sage=sage;
		this.sid=sid;
		}
	
	/* b.Setters Dependency Injection
	//setters and getters 
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}*/
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sage=" + sage + ", sid=" + sid + "]";
	}
	
	

}
