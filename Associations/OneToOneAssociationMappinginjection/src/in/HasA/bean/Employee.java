package in.HasA.bean;

//Target object
public class Employee {
	
	//instance variables
	private String eId;
	private String eName;
	private String eAddress;
	
	//Has-A Relationship
	Account account;

	//Constructor injection.
	public Employee(String eId, String eName, String eAddress, Account account) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAddress = eAddress;
		this.account = account;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee Details  ");
		System.out.println("============================= ");
		System.out.println("Employee Details eid : "+ eId);
		System.out.println("Employee Details eName : " + eName);
		System.out.println("Employee Details eAddress : "+ eAddress);
		System.out.println();
		
		System.out.println("Account Details   ");
		System.out.println("============================= ");
		System.out.println("Account Details accNo : "+account.accNo);
		System.out.println("Account Details accName : "+account.accName);
		System.out.println("Account Details accType : "+account.accType);
		
		
	}
	
	
	
	

}
