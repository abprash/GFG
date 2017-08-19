package com.gfg.www;

import java.util.Arrays;

public class MajorityElementInSortedArray {

	public static void main(String[] args){
		int[] arr = {1, 2, 3, 3, 3, 3, 10};
		System.out.println(findMajorityElementInSortedArray(arr));
	}
	public static int findMajorityElementInSortedArray(int[] arr){
		if(arr == null)
			return -1;
		int count = 0, maxCount = Integer.MIN_VALUE, ans=0;
		for(int i=0; i<arr.length; i++){
			if(i == 0){
				count =1;
				continue;
			}
			if(arr[i] == arr[i-1])
				count++;
			else
				count=1;
			if(count > maxCount){
				maxCount = count;
				ans = arr[i];
			}
		}
		return ans;
	}
}
