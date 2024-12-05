package com.dsaarray;

public class D9_MaximumProductSubArray {
	
	public static void main(String[] args) {
		
//		int arr [] = {-2, 6, -3, -10, 0, 2};
		int arr [] = {6, -3, 10, -2, 1 -5};
		
		int maxArr = new D9_MaximumProductSubArray().maxProduct(arr);
		
		System.out.println(maxArr);
		
	}
	
	
	//Brute force method
//	int maxProduct(int arr []) {
//		
//		int max = Integer.MIN_VALUE;
//		int prod = 1;
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(prod == 0) {
//				prod = 1;
//			}
//			
//			prod *= arr[i];
//			
//			max = Math.max(prod, max);
//				
//		}
//		
//		int prod1 = 1;
//		 
//		for(int i = arr.length-1; i >= 0; i--) {
//			
//			if (prod1 == 0) {
//				prod1 = 1;
//			}
//			
//			
//			prod1*= arr[i];
//			
//			max = Math.max(prod1, max);
//			
//		}
//		
//		return max;
//	}
	
	int maxProduct(int arr []) {
		
		int preffixProd = 1;
		int suffixProd = 1;
		int maxProd = Integer.MIN_VALUE;
		
		int n = arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(preffixProd == 0) {
				preffixProd = 1;
			}
			
			if(suffixProd == 0) {
				suffixProd = 1;
			}
			
			preffixProd *= arr[i];
			suffixProd *= arr[n-i];
			
			maxProd = Math.max(maxProd, Math.max(preffixProd, suffixProd));		
			
		}
		
		return maxProd;
		
	}

}
