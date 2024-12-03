package com.dsa;

public class D12_CheckIfArraySorted {
	
	//Optimal approach { TC -> O(n) }
	public boolean checkSorted(int[] arr) {
		
	  for (int i = 1; i < arr.length; i++) {
		 
		  if(arr[i] >= arr[i - 1]) {
			  
		  } else {
			  return false;
		  }
		  
	 }
	  
	  return true;
		
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {1,2,2,3,3,4};
//		int[] arr = {1,2,1,3,4};
		int[] arr = {1,2,2,1,3,4};
		
		System.out.println(new D12_CheckIfArraySorted().checkSorted(arr));
		
	}

}
