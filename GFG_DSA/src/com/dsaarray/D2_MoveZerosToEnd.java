package com.dsaarray;

import java.util.Arrays;

public class D2_MoveZerosToEnd {

	public static void main(String[] args) {

		int arr[] = { 23, 0, 342, 0, 43, 0, 0, 43, 0, 0, 0, 3 };
		int temp[] = new int[arr.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				temp[j++] = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
		// OR Optimal Solution { TC -> O(n) }
		System.out.println("\nOptimal Solution:");
		
		int arr1[] = {23,0,4,5,64,30,0,0,0,4,0,32,42,0,43,5,6,0,0,5};
		
		int k = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			
			if(arr1[i] != 0) {
				int temp1 = arr1[i];
				arr1[i] = arr1[k];
				arr1[k] = temp1;
				k++;
			}
			
		}
		
		System.out.println(Arrays.toString(arr1));
		
		//Optimal Solution1 using two pointers method
		System.out.println("\nOptimal Solution1");
		
		int arr2[] = {23,0,4,5,64,30,0,0,0,4,0,32,42,0,43,5,6,0,0,5};

		int t = -1;
		
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr2[i] == 0) {
				t = i;
				break;
			}
			
		
		}
		
		
		for (int i = j + 1; i < arr2.length; i++) {
			
			if(arr2[i] != 0) {
				
				//Swap
				int temp1 = arr2[i];
				arr2[i] = arr2[t];
				arr2[t] = temp1;
				t++;
				
			}
			
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}

}