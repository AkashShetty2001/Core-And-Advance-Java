package problems;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
	public static void main(String[] args) {
		int nums[][]= 
			         {
			          {1,2,3},
			          {3,2,1}
			         };
		
System.out.println(maximumWealth(nums));
		
	}
	  static public int maximumWealth(int[][] accounts) {
		 int ans=Integer.MIN_VALUE;
		 for(int i=0;i<accounts.length;i++) {
			 int max=0;
			 for(int j=0;j<accounts[i].length;j++) {
				 max=max+accounts[i][j];
			 }
			 if(max>ans) {
				 ans=max;
			 }
		 }
		 return ans;
	        
	    }

}
