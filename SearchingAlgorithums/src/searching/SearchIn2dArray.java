package searching;

import java.util.Arrays;

//Search an element in an 2dArray if found return the row and column 
public class SearchIn2dArray {
	public static void main(String[] args) {
		
		int nums[][]= {
					   {1,2,3},
				       {4,5,6,7},
				       {8,9,10}
				      };
		int target=7;
		int ans[]=search(nums,target);
		System.out.println(Arrays.toString(ans));
		
	}
	
	static int[] search(int arr[][],int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return new int [] {i,j};
				}
			}
		}
		return new int [] {-1,-1};
		
	}

}
