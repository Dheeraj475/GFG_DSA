package com.dsaarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class D13_RemoveDuplicateFromSortedArray {
	
	//Brute force approach
	public HashSet<Integer> removeDuplicates(int[] arr) {
		
		HashSet<Integer> st = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			st.add(arr[i]);
			
		}
		
		return st;
		
	}
	
	//Optimal approach
	public String removeDuplicates1(int[] arr){
		
		int j = 0;
		
		
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] != arr[j]) {
				arr[j+1] = arr[i];
				j++;
			}
			
		}
		
		int arr1 [] = Arrays.copyOfRange(arr, 0, j+1);
		
		return Arrays.toString(arr1);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,3,3,4,5,5};
		
		System.out.println(new D13_RemoveDuplicateFromSortedArray().removeDuplicates1(arr));
		
		
	}

}
