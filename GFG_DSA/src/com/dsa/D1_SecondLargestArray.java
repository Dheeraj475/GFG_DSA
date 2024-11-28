package com.dsa;

public class D1_SecondLargestArray {

	public int getSecondLargest(int[] arr) {

		int max = arr[0];
		int max1 = Integer.MIN_VALUE;
		boolean check = true;

		for (int i = 0; i < arr.length; i++) {

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

	public static void main(String[] args) {
		
		
		int arr [] = {23,22,4,42,8,29,20};
		
		System.out.println(new D1_SecondLargestArray().getSecondLargest(arr));
		

	}

}