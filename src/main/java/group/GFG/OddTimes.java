package com.gfg.www;

public class OddTimes {
	public static void main(String[] args){
		int[] a = {1,1,2,4,5,5,5,5,5,5,3,5,3,4,46,43,46,43,2};
		findOddNumber(a);
	}
	public static int findOddNumber(int[] arr){
		if(arr == null)
			return 0;
		int res = arr[0];
		for(int i=1;i<arr.length;i++){
			res^=arr[i];
		}
		System.out.println(res);
		return res;
	}

}
