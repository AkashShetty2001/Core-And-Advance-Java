package searching;

public class OrderAgnosticBS {
	public static void main(String[] args) {
		//int a[]= {0,1,2,43,56,78,91,100};
		int a[]= {100,90,80,70,60,50,40,10};
		int target=99;
		int ans =orderAgnosticBS(a,target);
		System.out.println(ans);
		
	}
	
	static int orderAgnosticBS(int arr[],int target) {
		int start=0;
		int end=arr.length-1;
		
		//to check whether array is sorted in ascending or descending order.
		boolean isAsc=arr[start]<arr[end];
		
		
		while(start<=end) {
			int mid=(start + (end-start) /2);
			
			if(target==arr[mid])
				return mid;
			
			if(isAsc) {
			if(target>arr[mid]) 
				start=mid+1;
			else if(target<arr[mid]) 
				end=mid-1;
			}
			
			else {
				if(target<arr[mid]) 
				start=mid+1;
			else if(target>arr[mid]) 
				end=mid-1;
				
			}
			
		}
		return -1;
	}
}

	


