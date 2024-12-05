package com.dsaarray;

public class D14_LinearSearch {

	public static int search(int [] arr,int num) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == num) {
				return i;
			} 
			
			
		}
		
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 6, 7, 8, 4, 1 };
		int num = 4;
		
		System.out.println(search(arr, num));

	}

}
