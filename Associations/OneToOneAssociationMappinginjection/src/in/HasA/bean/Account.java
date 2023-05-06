package in.HasA.bean;

//Dependent Object
public class Account {
	
	//instance variables
	 String accNo;
	 String accName;
	 String accType;
	
	//injecting values through constructor
	public Account(String accNo, String accName, String accType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
	}
	
	
	

}
