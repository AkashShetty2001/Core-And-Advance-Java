package innerClasses;


class Computer{
	public void Specifications() {
		System.out.println(" I7 12th gen ,16 ram ,512 ssd");
	}
	
}

class Laptop extends Computer {
	/*public void Specifications() {
		System.out.println(" I9 12th gen ,16 ram ;512 ssd");//overridden methods
	}*/
	
}


public class AnonymousInnerClass {
	public static void main(String[] args) {
		/*Computer obj = new Laptop();
		obj.Specifications();*/
		/*in the above code i am overridding a method, this can be done using an  Anonymous inner class.*/
		
		Computer obj = new Laptop()
				{
			        public void Specifications() {
				      System.out.println(" I9 12th gen ,16 ram ,512 ssd");//overridden methods
			         }
			
				};
				obj.Specifications();
	}

}
