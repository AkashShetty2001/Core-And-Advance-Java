package manyToMany;

public class Student {
	
	private String sID;
	private String sName;
	private String sAddress;
	
	//Has-A
	Courses [] course;

	public Student(String sID, String sName, String sAddress, Courses[] course) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sAddress = sAddress;
		this.course = course;
	}
	
	public void StudentDetails() {

		System.out.println("Student details ");
		System.out.println("================");
		System.out.println("ID : "+sID);
		System.out.println("Name :"+sName);
		System.out.println("Address : "+sAddress);
		System.out.println("Course Details ");
		for(Courses c:course) {
			System.out.println("cousreId :"+c.cID);
			System.out.println("cousreName :"+c.cName);
			System.out.println("cousreCost :"+c.cCost);
			System.out.println();
		}
	}
	
	

}
