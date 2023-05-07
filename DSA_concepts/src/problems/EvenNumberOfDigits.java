package problems;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumberOfDigits {
	public static void main(String[] args) {
		int []nums= {12,345,2,6,7896,89};
		System.err.println(findNumbers(nums));
		
		System.out.println(digits(0));
		System.out.println(digits(-0));
		
		
	}
	static int findNumbers(int[] nums) {
		int count=0;
		for(int num:nums){
			if(even(num)) {
				count++;
			}
		}
		
		return count;
        
    }
	
	//Function to check whether the number contains even no. of digits are not.
	static boolean even(int num) {
		int noOfDigits=digits(num);
		return noOfDigits % 2==0;
	}
	
	
	//To count number of digits
	static int digits(int num) {
		int count=0;
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	//To count number of digits shortcut
	static int digits2(int num) {
		if(num<0) {
			num=num*-1;
		}
		return (int)(Math.log10(num)+1);
		
	}

}
