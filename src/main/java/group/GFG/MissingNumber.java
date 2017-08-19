package com.gfg.www;

public class MissingNumber {
	
	public static void main(String[] args){
		int[] x = {1, 2, 4,6, 3, 7, 8};
		System.out.println(findMissingNumber(x));
	}
	
	public static int findMissingNumber(int[] arr){
		if(arr == null)
			return 0;
		int res1 = 0,res2 = 0;
		for(int i=0; i<arr.length ; i++){
			res1^=arr[i];
		}
		for(int i=1; i<=arr.length+1; i++){
			res2 ^= i;
		}
		return res1 ^ res2;
	}

}
