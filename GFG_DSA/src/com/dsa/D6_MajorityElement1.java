package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class D6_MajorityElement1 {
	
	public static void main(String[] args) {
		
		int[] arr = {2,1,1,2,1,1,1,7};
//		int b = brute(arr);
//		System.out.println(b);
//		int b1 = better(arr);
//		System.out.println(b1);
		int b2 = majorityElement(arr);
		System.out.println(b2);
		
	}
	
	static int brute(int[] arr) {
		
		
		
		for(int i =0; i<arr.length; i++) {
			
			int cnt = 0;
			
			for(int j=0; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					cnt++;
				}
				
				
			}
			
			if(cnt > arr.length/2) {
				return arr[i];
			}
		}
		
		return -1;
		
	}
	
	
	static int better(int[] arr) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i =0; i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i],arr[i]++);
			}else {
				map.put(arr[i], 1);
			}
			
			
		}
		
		for(Integer i : map.values()) {
			System.out.println(i);
		}
		
		return -1;
	}
	
	
	 static int majorityElement(int[] nums) {
		 
//		 	nums = [2,1,1,2,1,1,1,7]

	        int cnt = 0;
	        int val = Integer.MIN_VALUE;

	        for(int i =0; i<nums.length; i++){

	            if(cnt == 0){
	                val = nums[i];
	                cnt = 1;
	            }else if(nums[i] == val){
	                cnt++;
	            }else{
	                cnt--;
	                
	            }
	        }
	        
	        cnt =0;
	        for(int i = 0; i<nums.length;i++) {
	        	
	        	if(val == nums[i]) {
	        		cnt++;
	        	}
	        }
	        
	        if(cnt > nums.length/2) {
	        	return val;
	        }
	        
	        return -1;
	        
	    }

}