package com.gfg.www;

import java.util.Arrays;

public class SecondSmallestAndSmallestInArray {
	
	public static void main(String[] args){
		//
		int[] arr =  {12, 13, 1, 10, 34, 1, -99, -98, 100, 10001, 2374};
		System.out.println(Arrays.toString(getSecondAndFirstMin(arr)));
	}
	public static int[] getSecondAndFirstMin(int[] arr){
		if(arr == null)
			return null;
		int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i] < firstMin){
				firstMin = arr[i];
			}
			if(arr[i] < secondMin && arr[i] > firstMin){
				secondMin = arr[i];
			}
		}
		
		return new int[]{firstMin, secondMin};
	}

}
