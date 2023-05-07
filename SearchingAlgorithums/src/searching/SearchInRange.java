package searching;

//Search for an element in the range in an array if found return index else return -1.
public class SearchInRange {

	public static void main(String[] args) 
	{
		int nums[]= {10,20,30,40,50};
		int target=30;
		int ans=linearSearch(nums,target,2,4);
		System.out.println(ans);
		
	}

	static int linearSearch (int arr[],int target,int start,int end) {
		
		if(arr.length==0) {
			return -1;
		}
	
	for(int index=start;index<=end;index++) {
		int element=arr[index];
		if(element == target) {
			return index;
		}
		
	}
	return -1;
}

}




