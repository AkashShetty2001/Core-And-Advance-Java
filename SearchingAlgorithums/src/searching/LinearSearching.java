package searching;

//Search for an element in an array if found return index else return -1.
public class LinearSearching {
	
	public static void main(String[] args) 
	{
		int nums[]= {10,20,30,40,50};
		int target=100;
		int ans=linearSearch(nums,target);
		System.out.println(ans);
		
	}

	static int linearSearch (int arr[],int target) {
		
		if(arr.length==0) {
			return -1;
		}
	
	for(int index=0;index<arr.length;index++) {
		int element=arr[index];
		if(element == target) {
			return index;
		}
		
	}
	return -1;
}

}



