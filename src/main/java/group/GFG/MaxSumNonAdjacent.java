package com.gfg.www;

public class MaxSumNonAdjacent {
	
	public static void main(String[] args){
		//also called house robber problem
		int[] arr = {5,  -5, 10, 40, -50, -35};
		int arr1[] = {5, 5, 10, 100, 10, 5};
		System.out.println(findMaxSumNonAdjacent(arr));
	}
	
	public static int findMaxSumNonAdjacent(int[] arr){
		//find the maximum sum of elements and the elements must be non adjacent
		if(arr == null)
			return 0;
		int incl = arr[0];
		int excl = 0;
		for(int i=1; i<arr.length; i++){
			//put the inclusive value in a temp variable
			int temp = incl;
			//recalc the incl so that it includes the (sum of excl and current element) and (old excl)
			incl = Math.max(excl + arr[i], incl);
			//assign the old incl to excl
			excl = temp;
		}
		return Math.max(incl, excl);
	}

}
