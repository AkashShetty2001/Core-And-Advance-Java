package searching;


//Search for a MaximumNumber in an 2Darray..
public class MavValueIn2DArray {
	public static void main(String[] args) {
		int nums[][]= {
						{1,2,3},
						{4,89,100,65},
						{134,178,987,87}
		              };
		System.out.println(maxNum(nums));
		}
		
	
	static int maxNum(int arr[][]) {
		int max=Integer.MIN_VALUE;
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}*/
		
		
		//using for-each
		for(int[]a:arr) {
			for(int element:a) {
				if(element>max) {
					max=element;
				}
			}
		}
		return max;
	}

}
