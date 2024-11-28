package com.dsa;

public class D9_MaximumProductSubArray {
	
	public static void main(String[] args) {
		
		int arr [] = {-2, 6, -3, -10, 0, 2};
		
		int maxArr = new D9_MaximumProductSubArray().maxProduct(arr);
		
		System.out.println(maxArr);
		
	}
	
	int maxProduct(int arr []) {
		
		int curProd = 1;
		int maxProd = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			curProd *= arr[i]; 
			System.out.println("curProd = "+curProd);
			maxProd = Math.max(maxProd, curProd);
			System.out.println("maxProd = "+maxProd);
		}
		
		return maxProd;
	}

}
