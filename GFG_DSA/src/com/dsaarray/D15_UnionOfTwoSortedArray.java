package com.dsaarray;

import java.util.Arrays;
import java.util.HashSet;

public class D15_UnionOfTwoSortedArray {
	
	//Brute force approach
	public static String unionArray(int[] arr, int[] arr1) {
		
		HashSet<Integer> st =  new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			st.add(arr[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			st.add(arr1[i]);
		}
		
		int[] unionArr = new int[st.size()];
		
		int k = 0;
		
		for(Integer s : st) {
			unionArr[k++] = s;
		}
		
		return Arrays.toString(unionArr);
		
	}
	
	//Optimal approach ( 2 pointer approach)
	
	public static void main(String[] args) {
		
	
	int[] arr = {1,1,2,3,3,5,5};
	int[] arr1 = {2,3,4,5,6};
	
	
	System.out.println(unionArray(arr, arr1));
	
	
	}
	
	

}
