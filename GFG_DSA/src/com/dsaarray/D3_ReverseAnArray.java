package com.dsaarray;

import java.util.Arrays;

public class D3_ReverseAnArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int count = 0;
		
        int n = arr.length;
        
        int[] a1 = new int[n];
        int j = 0;
        
        
        for(int i = arr.length-1; i >= 0 ; i--){
            
            a1[j] = arr[i];
            j++;
        }
        
       System.out.println(Arrays.toString(a1));
       
       //OR for Optimal Solution
       System.out.println("\nOptimal Solution:");
       int[] arr1 = {2,42,23,54,6,4,56,3};
       
       int i = 0;
       int k = arr1.length -1;
       
       while(i < k) {
    	   int temp = arr1[i];
    	   arr1[i] = arr1[k];
    	   arr1[k] = temp;
    	   i++;
    	   k--;
       }
       
       System.out.println(Arrays.toString(arr1));
       
       
		
        
		
		
		
		
		
	}

}