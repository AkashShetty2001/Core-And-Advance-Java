package searching;

//BinarySearch Algorithm
public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {0,1,2,43,56,78,91,100};
		int target=6;
		int ans =binarySearch(a,target);
		System.out.println(ans);
	}
		
	//If Element is found return index else return -1
		static int binarySearch(int arr[],int target) {
			int start=0;
			int end=arr.length-1;
			
			while(start<=end) {
				int mid=(start + (end-start) /2);
				
				if(target>arr[mid]) {
					start=mid+1;
				}
				else if(target<arr[mid]) {
					end=mid-1;
				}
				else
					return mid;

			}
			return -1;
		}
	}


