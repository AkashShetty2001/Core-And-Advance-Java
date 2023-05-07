package manyToMany;

public class TestApp {
	public static void main(String args[]) {
		
		Courses c1 = new Courses("A1",1000,"JAVA");
		Courses c2 = new Courses("A2",2000,"phython");
		Courses c3 = new Courses("A3",3000,"SpringBoot");
		
		
		Courses course[]=new Courses[3];
		course[0]=c1;
		course[1]=c2;
		course[2]=c3;
		
		Student s1=new Student("01","Akash","Banglore",course);
		Student s2=new Student("02","Rahul","Chennai",course);
		Student s3=new Student("03","Kumar","Kolkata",course);
		
		s1.StudentDetails();
		s2.StudentDetails();
		s3.StudentDetails();
		
		
		
		
		
	}

}
