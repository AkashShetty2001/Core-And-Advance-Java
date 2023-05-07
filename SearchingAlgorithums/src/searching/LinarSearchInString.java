package searching;

//search for a character in a string if present return true else return false
public class LinarSearchInString {
	public static void main(String[] args) {
		
		String name="Akash";
		char target='A';
		System.out.println(linearSearch(name,target));
		
	}
	
	static boolean linearSearch(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		
		//using for-each
		/*for(char ch:str.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}*/
		return false;
	}

}
