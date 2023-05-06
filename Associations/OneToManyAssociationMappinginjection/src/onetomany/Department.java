package onetomany;

//Target Object
public class Department {
	
	//instance variables
	private String dID;
	private String dName;
	
	//Has-A relationship
	 private Employee[] emps;

	 //constructor injection
	public Department(String dID, String dName, Employee[] emps) {
		super();
		this.dID = dID;
		this.dName = dName;
		this.emps = emps;
	}
	
	public void DeptDetails() {
		System.out.println("Department Details   ");
		System.out.println("========================");
		System.out.println("Department Details dID is :  "+ dID);
		System.out.println("Department Details dName is :  "+dName);
		System.out.println();
		
		System.out.println("Employee Deatils  ");
		System.out.println("========================");
		
		for(Employee employee:emps) {
			System.out.println("Employee Details eId is :"+ employee.eId);
			System.out.println("Employee Details eName is :"+ employee.eName);
			System.out.println("Employee Details eAddress is :"+ employee.eAddress);
			System.out.println();
		}
		
		
		
		
	}
	 
	 

	

}
