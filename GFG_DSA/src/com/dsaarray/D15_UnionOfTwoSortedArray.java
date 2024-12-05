package com.dsaarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class D15_UnionOfTwoSortedArray {

	// Brute force approach
	public static String unionArray(int[] arr, int[] arr1) {

		HashSet<Integer> st = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			st.add(arr[i]);
		}

		for (int i = 0; i < arr1.length; i++) {
			st.add(arr1[i]);
		}

		int[] unionArr = new int[st.size()];

		int k = 0;

		for (Integer s : st) {
			unionArr[k++] = s;
		}

		return Arrays.toString(unionArr);

	}

	// Optimal approach ( 2 pointer approach )
	public static ArrayList<Integer> unionArray1(int[] arr, int[] arr1) {
	    ArrayList<Integer> unionArr = new ArrayList<>();

	    int i = 0;
	    int j = 0;
	    int n1 = arr.length;
	    int n2 = arr1.length;

	    while (i < n1 && j < n2) {
	        if (arr[i] < arr1[j]) { // Case for arr[i] smaller
	            if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != arr[i]) {
	                unionArr.add(arr[i]);
	            }
	            i++;
	        } else if (arr[i] > arr1[j]) { // Case for arr1[j] smaller
	            if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != arr1[j]) {
	                unionArr.add(arr1[j]);
	            }
	            j++;
	        } else { // Case for arr[i] == arr1[j]
	            if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != arr[i]) {
	                unionArr.add(arr[i]);
	            }
	            i++;
	            j++;
	        }
	    }

	    // Adding remaining elements from arr
	    while (i < n1) {
	        if (unionArr.get(unionArr.size() - 1) != arr[i]) {
	            unionArr.add(arr[i]);
	        }
	        i++;
	    }

	    // Adding remaining elements from arr1
	    while (j < n2) {
	        if (unionArr.get(unionArr.size() - 1) != arr1[j]) {
	            unionArr.add(arr1[j]);
	        }
	        j++;
	    }

	    return unionArr;
	}

	public static void main(String[] args) {
	    int[] arr = { 1, 1, 2, 3, 3, 5, 5, 7};
	    int[] arr1 = { 2, 3, 4, 5, 6 };

	    System.out.println(unionArray1(arr, arr1)); // Should print the union of arr and arr1
	}


}
