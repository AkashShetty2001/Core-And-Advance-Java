package searching;

//Search for maximum value in an array and return value.
public class MaxValue {

	public static void main(String[] args) {
		int nums[]= {100,17,34,5,55,67};
		System.out.println(MaximumNumber(nums));
		}
	
	static int MaximumNumber(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}

