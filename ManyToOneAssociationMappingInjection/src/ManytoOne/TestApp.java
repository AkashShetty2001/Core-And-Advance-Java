package ManytoOne;

public class TestApp {
	public static void main(String args[]) {
		
		Branch branch = new Branch();
		branch.setbID("RCB23");
		branch.setbName("Banglore");
		
		Student s1 = new Student();
		s1.setsID("1");
		s1.setsName("virat");
		s1.setsAddress("India");
		s1.setBranch(branch);
		
		Student s2 = new Student();
		s2.setsID("2");
		s2.setsName("maxwell");
		s2.setsAddress("Australia");
		s2.setBranch(branch);
		
		Student s3 = new Student();
		s3.setsID("3");
		s3.setsName("faf");
		s3.setsAddress("South Africa");
		s3.setBranch(branch);
		
		System.out.println("Student details ");
		System.out.println("================");
		System.out.println("ID : "+s1.getsID());
		System.out.println("Name :"+s1.getsName());
		System.out.println("Address : "+s1.getsAddress());
		System.out.println("branchId :"+s1.getBranch().getbID());
		System.out.println("branchName :"+s1.getBranch().getbName());
		
		System.out.println();
		
		System.out.println("ID : "+s2.getsID());
		System.out.println("Name :"+s2.getsName());
		System.out.println("Address : "+s2.getsAddress());
		System.out.println("branchId :"+s2.getBranch().getbID());
		System.out.println("branchName :"+s2.getBranch().getbName());
		
		System.out.println();
		
		System.out.println("ID : "+s3.getsID());
		System.out.println("Name :"+s3.getsName());
		System.out.println("Address : "+s3.getsAddress());
		System.out.println("branchId :"+s3.getBranch().getbID());
		System.out.println("branchName :"+s3.getBranch().getbName());
		
		
		
	}

}
