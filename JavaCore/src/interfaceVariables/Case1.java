package interfaceVariables;


interface One{
	int x=999;
}

interface Two{
	int x=888;
}

public class Case1  implements One,Two{
	public static void main(String[] args) {
		//System.out.println(x);//it results in compile time error,due to ambiguous variable.
		System.out.println("x in interface One : "+One.x);
		System.out.println("x in interface Two : "+Two.x);
		
	}	
} 
	


