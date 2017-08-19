package com.gfg.www;

import java.util.Arrays;

public class FindingSumClosestToZero {

	public static void main(String[] args) {
		//int[] arr = { -45, -20, -2, -1, 12, 15, 30 };
		int[] arr = {1, 60, -10, 70, -80, 85};
		System.out.println(Arrays.toString(findSumClosestToZero(arr)));

	}

	public static int[] findSumClosestToZero(int[] arr) {
		// sort and use 2 pointer method
		if (arr == null)
			return null;
		Arrays.sort(arr);
		int r = arr.length - 1;
		int sum = 0;
		int minSum = Integer.MAX_VALUE;
		int l = 0;
		int ans1 = 0, ans2=0;
		while (l < r) {
			sum = arr[l] + arr[r];
			if (Math.abs(sum) < Math.abs(minSum)) {
				minSum = sum;
				ans1 = arr[l];
				ans2 = arr[r];
			}
			if (sum > 0)
				r--;
			else if (sum < 0)
				l++;
		}
		return new int[] { ans1, ans2 };
	}

}