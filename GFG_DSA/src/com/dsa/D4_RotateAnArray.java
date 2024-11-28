package com.dsa;

import java.util.Arrays;

public class D4_RotateAnArray {
	
	public static void main(String[] args) {
		
		
		//Brute force method of Counter clockwise
//		int d = 6;
//		
//		int arr[] = {1,2,3,4,5};
//		
//		if(d > arr.length) {
//			d = d/arr.length;
//		}
//		
//		
//		for(int i = 0; i<d; i++) {
//			
//			rotate(arr);
//		}
//		
//		System.out.println("\nBrute force Counter Clock wise :");
//		System.out.println(Arrays.toString(arr));
//		
//		
//	}
	
//	static void rotate(int[] arr) {
//		
//		int val = arr[0];
//		
//		for(int i = 0; i < arr.length-1; i++) {
//			
//			arr[i] = arr[i+1];
//		}
//		
//		arr[arr.length-1] = val;
//		
//		
//	}
		
		
		
		//Brute force method of clockwise
//		int d = 2;
//		
//		int arr[] = {1,2,3,4,5};
//		
//		if(d > arr.length) {
//			d = d/arr.length;
//		}
//		
//		
//		for(int i = 0; i<d; i++) {
//			
//			rotate(arr);
//		}
//		
//		System.out.println("\nBrute force Clock wise :");
//		System.out.println(Arrays.toString(arr));
		
		
//	}
	
//	static void rotate(int[] arr) {
//		
//		int val = arr[arr.length-1];
//		
//		for(int i = arr.length-1; i>0; i--) {
//			
//			arr[i] = arr[i-1];
//		}
//		
//		arr[0] = val;
//		
//		
//	}
		
	
	//Optimal Counter Clock rotation
//        int d = 3;
//        int[] arr = {1, 2, 3, 4, 5};
//        
//        int n = arr.length;
//        
//        if (d > n) {
//            d = d % n;
//        }
//        
//       // Perform the rotation
//        reverse(arr, 0, d - 1);
//        reverse(arr, d, n - 1);
//        reverse(arr, 0, n - 1);
//        
//        System.out.println("Optimal Counter Clockwise Rotation:");
//        System.out.println(Arrays.toString(arr)); // Display the rotated array
//    }
    
    
    // Helper method to reverse a portion of the array
//    static void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end]; 
//            arr[end] = temp;       
//            start++;              
//            end--;              
//        }
//	
//	}
		
	  //Optimal Counter Clock rotation
       int d = 2;
       int[] arr = {1, 2, 3, 4, 5};
       
       int n = arr.length;
       
       if (d > n) {
           d = d % n;
       }
       
      // Perform the rotation
       reverse(arr, n-d,n-1);
       reverse(arr, 0, n-d-1);
       reverse(arr, 0, n - 1);
       
       System.out.println("Optimal Clockwise Rotation:");
       System.out.println(Arrays.toString(arr)); // Display the rotated array
   }
   
   
   // Helper method to reverse a portion of the array
   static void reverse(int[] arr, int start, int end) {
       while (start < end) {
           int temp = arr[start];
           arr[start] = arr[end]; 
           arr[end] = temp;       
           start++;              
           end--;              
       }
	
	}
		
	
    
    
	
	
}