package com.dsaarray;

//Kadane's Algorithm
public class D8_MaximumSumSubArray {

	//Brute force method
//	public static void main(String[] args) {
//		
//		
//		System.out.println("Brute force");
//		int[] arr = {2,3,-8,7,-1,2,3};
//		int max = Integer.MIN_VALUE;
//		
//		for(int i = 0;i <arr.length; i++) {
//			
//			int sum = 0;
//			
//			for(int j = i; j<arr.length; j++) {
//				
//				sum = sum + arr[i];
//				max = Math.max(max, sum);
//				
//			}
//			
//		}
//		
//		System.out.println(max);
//	}
	
	
	
	//Optimal method 
	public static void main(String[] args) {
		
		int [] arr = {2, 3, -8, 7, -1, 2, 3};
		
		int value = new D8_MaximumSumSubArray().maxSubArray(arr);
		System.out.println(value);
		
	}
	
	
	int maxSubArray(int [] arr) {
		
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (currSum < 0) {
				currSum = 0;
			}
			
			currSum += arr[i];
			maxSum = Math.max(currSum, maxSum);	
		}
		
		return maxSum;
		
	}
	
}
