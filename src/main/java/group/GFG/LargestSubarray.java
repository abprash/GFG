package com.gfg.www;

import java.util.Arrays;

public class LargestSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,-1,-6,2,6,0,-3,5,9};
		int[] b = {-2,-3,4,-1,-2,1,5,-3,-1,-2,-6,9,6,12,-90};
		int[] res = maxSubArray(b);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] maxSubArray(int[] arr){
		//using kadane's algo
		int maxSoFar = 0;
		int currMax = 0;
		int startIndex=0, endIndex = 0, sum=0;
		if(arr == null)
			return null;
		int s = 0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
			if(sum < 0){
				//startIndex = i+1;
				sum=0;
				s=i+1;
			}
			else{
				if(sum>maxSoFar){
					maxSoFar = sum;
					startIndex = s;
					endIndex = i;
				}
			}
		}
		System.out.println("max--"+maxSoFar);
		return new int[]{startIndex, endIndex};
	}
	
	public static int[] returnMaxSubArray(int[] a){
		int[] res = new int[2];
		int maxEndingHere = 0;
		int maxSoFar = 0;
		for(int i=0;i <a.length ; i++){
		maxEndingHere += a[i];
		if(maxEndingHere <0 )
			maxEndingHere = 0;
		if(maxEndingHere >maxSoFar)
			maxSoFar = maxEndingHere;
		}
		return new int[] {maxSoFar};
	}

}
