package com.gfg.www;

import java.util.ArrayList;

public class LeadersInArray {
	
	public static void main(String[] args){
		//find the leaders in the array
		System.out.println(findLeaders(new int[] {16, 17, 4, 3, 5, 2}));
	}
	
	public static ArrayList<Integer> findLeaders(int[] arr){
		if(arr == null)
			return null;
		int maxSoFar = Integer.MIN_VALUE;
		int curr = 0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=arr.length-1; i>=0; i--){
			curr = arr[i];
			if(curr > maxSoFar){
				maxSoFar = curr;
				ans.add(curr);
			}
			
		}
		return ans;
	}

}
