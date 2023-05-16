package interfaceVariables;

/* Interfaces which does not contain any methods,
 * but by implementing them to objects we get some abilities such interfaces 
 * are called as marker interface.
 * eg: cloneable, serializable and singleThreadModel
 */
interface Serializable{
	
}
interface Cloneable{
	
}

class Sample implements  Serializable{
	
}
public class MarkerInterface {
	public static void main(String[] args) {
		Sample s= new Sample();
	}

}
