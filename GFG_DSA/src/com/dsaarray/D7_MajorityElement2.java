package com.dsaarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Moore's Voting Algorithm
public class D7_MajorityElement2 {
	
	public static void main(String[] args) {
		
//		int arr[] = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
		int arr[] = {1,2,2,3};
		System.out.println(new D7_MajorityElement2().findMajority(arr));
	}
	
	 public List<Integer> findMajority(int[] nums) {
		 
		 int cnt1 = 0;
		 int cnt2 = 0;
		 int val1 = Integer.MIN_VALUE;
		 int val2 = Integer.MIN_VALUE;
		 
		 List<Integer> al = new ArrayList<>();
		 
		 for (int i = 0; i < nums.length; i++) {
			
			 if (cnt1 == 0 && val2 != nums[i]) {
				 val1 = nums[i];
				 cnt1 = 1;
			 }else if (cnt2 == 0 && val1 != nums[i]) {
				 val2 = nums[i];
				 cnt2 = 1;
			 }else if (val1 == nums[i]) {
				 cnt1++;
			 }else if (val2 == nums[i]) {
				 cnt2++;
			 }else {
				 cnt1--;
				 cnt2--;
			 }
			}
			 
			 cnt1 = 0;
			 cnt2 = 0;
			 for (int j = 0; j < nums.length; j++) {
				if(val1 == nums[j]) {
					cnt1++;
				}
				
				if(val2 == nums[j]) {
					cnt2++;
				}
			} 
			 
			int mini = nums.length / 3;
			
			if(cnt1 > mini) {
				al.add(val1);
			}
			
			if(cnt2 > mini) {
				al.add(val2);
			}
			
			Collections.sort(al);
			
			return al;
			
			 
			 
		}
		 
	 }
	
