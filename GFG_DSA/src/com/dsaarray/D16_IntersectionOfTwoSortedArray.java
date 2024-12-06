package com.dsaarray;

import java.util.ArrayList;

public class D16_IntersectionOfTwoSortedArray {
	
	//Brute force method
	public static ArrayList<Integer> intersectionArray(int[] A, int[] B) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int[] visited = new int[B.length];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				
				if(A[i] == B[j] && visited[j] == 0) {
					ans.add(B[j]);
					visited[j] = 1;
					break;
					
				} else if (B[j] > A[i]) break;
				
			}
		}
		
		return ans;
		
	}
	
	//Optimal method 2 pointers approach
	public static ArrayList<Integer> intersectionArray1(int[] A, int[] B) {
		
		int i = 0;
		int j = 0;
		int n = A.length;
		int m = B.length;
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(i < n && j < m) {
			
			if(A[i] < B[j]) {
				i++;
			} else if (B[j] < A[i]) j++;
			 
			else {
				ans.add(A[i]);
				i++;
				j++;
			}
			
			
			
		}
		
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] A = {1,2,2,3,3,4,5,6};
		int[] B = {2,3,3,5,6,7};
		
//		System.out.println(intersectionArray(A,B));
		System.out.println(intersectionArray1(A, B));
		
		
		
	}

}
