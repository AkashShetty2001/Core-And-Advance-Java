package in.HasA.bean;

public class MainTest {
	public static void main(String args[]) {
		
		Account account=new Account("acc01","Sachin","Savings");
		
		//Constructor injection
		Employee employee=new Employee("eId01","Sachin","Banglore",account);
		employee.getEmployeeDetails();
		
	}

}
