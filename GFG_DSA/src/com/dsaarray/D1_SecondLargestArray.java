package com.dsaarray;

import java.util.Arrays;

public class D1_SecondLargestArray {
	
	/*Finding max number*/ 
	
	//Brute force approach { TC -> O(n log n) }
	public int largest(int[] arr) {
		
		Arrays.sort(arr);
		int n = arr.length-1;
		
		int max = arr[n];
		
		return max;
	}
	
	//Optimal approach { TC -> O(n) }
	public int largest1(int[] arr) {
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
			
		}
		
		return max;
		
	}
	
	/*Finding second max number*/
	
	//Brute force approach { TC -> O(n log n) }
	public int getSecondLargest(int[] arr) {
		
		Arrays.sort(arr);
		
		int n = arr.length-1;
		int max = arr[n];
		int max1 = Integer.MIN_VALUE;
		
		for(int i = n-1; i >= 0; i--) {
			
			if(arr[i] != max) {
				max1 = arr[i];
				break;
			}
			
		}
		
		return max1;
				
	}
	
	
	//Better approach { TC -> O(2n) }
	public int getSecondLargest1(int[] arr) {

		int max = arr[0];
		int max1 = Integer.MIN_VALUE;
		boolean check = true;

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (max > arr[i] && max1 < arr[i]) {
				max1 = arr[i];
				check = false;
			}
		}
		
		
		if(check) {
			return -1;
		}
		
		return max1;
	}
	
	//Optimal approach { TC -> O(n) }
	public int getSecondLargest2(int[] arr) {
		
		int largest = arr[0];
		int slargest = Integer.MIN_VALUE;
		
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				slargest = largest;	
				largest = arr[i];
			}
			 
			else if (arr[i] < largest && arr[i] > slargest) {
				
				slargest = arr[i];
				
			}
				
			
		}
		
		
		return slargest;
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		int arr [] = {23,22,4,42,8,29,20,30};
		
//		System.out.println(new D1_SecondLargestArray().largest(arr)); //prints 42
		
		System.out.println(new D1_SecondLargestArray().getSecondLargest2(arr)); //prints 29

	}

}