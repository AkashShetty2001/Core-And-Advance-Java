package innerClasses;


class C{
	public void show() {
		System.out.println("inside class C");
	}
	
	 static class D{
		public void show() {
			System.out.println("inside class D");
		}
		
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		//creating an object of C class
		C obj= new C();
		 obj.show();
		 
	    //creating an object of D class
		 C.D obj1;//since D is static class directly we can use outer class as a reference.
		 obj1=new C.D();
		 obj1.show();
		 	
	}

}
