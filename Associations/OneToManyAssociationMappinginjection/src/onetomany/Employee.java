package onetomany;

//Dependent object
public class Employee {
	
	//instance variables
		String eId;
	    String eName;
		String eAddress;

		
		 //construction injection
		public Employee(String eId, String eName, String eAddress) {
			super();
			this.eId = eId;
			this.eName = eName;
			this.eAddress = eAddress;
			
		}
		 
		 
}
