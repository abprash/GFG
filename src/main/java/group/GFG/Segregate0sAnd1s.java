package com.gfg.www;

import java.util.Arrays;

public class Segregate0sAnd1s {
	
	public static void main(String[] args){
		int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		System.out.println(Arrays.toString(segregate(arr)));
	}
	
	public static int[] segregate(int[] arr){
		if(arr == null)
			return null;
		int l = 0;
		int r = arr.length -1;
		while(l<r){
			if(arr[l] == 1 && arr[r] == 0){
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
			if(arr[l] == 0)
				l++;
			if(arr[r] == 1)
				r--;
		}
		return arr;
	}

}
