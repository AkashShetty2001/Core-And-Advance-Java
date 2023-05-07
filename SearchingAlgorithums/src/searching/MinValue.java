package searching;

//Search for minimum value in an array and return value.
public class MinValue {
	public static void main(String[] args) {
		
		int nums[]= {10,17,34,5,55,67};
		System.out.println(MinimumNumber(nums));
		
		
	}
	
	static int MinimumNumber(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
