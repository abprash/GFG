package com.gfg.www;

public class MinimumDistanceToASortedArray {
	public static void main(String[] args){
		//int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int[] arr = {0, 1, 15, 25, 6, 7, 30, 40, 50};
		findTheMinimumDistance(arr);
	}
	public static int[] findTheMinimumDistance(int[] arr){
		//int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		if(arr == null)
			return null;
		//get the two places where the two arrays break order
		int l = 0, r = arr.length -1;
		while(true){
			if(arr[l] > arr[l+1] && arr[r] < arr[r-1])
				break;
			if(arr[l] < arr[l+1])
				l++;
			if(arr[r] > arr[r-1])
				r--;
		}
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i=l; i<=r; i++){
			if(arr[i]<min){
				min = arr[i];
				//System.out.println("--"+min);
			}
			if(arr[i]>=max){
				max = arr[i];
				//System.out.println("--"+max);
			}
		}
		System.out.println(min+","+max);
		int n1 = arr[l], n2 = arr[r];

		l=0 ;
		r=arr.length-1;
		while(l<r){
			if(arr[l] > min && arr[r] < max)
				break;
			if(arr[l] < min)
				l++;
			if(arr[r] > max)
				r--;
			
		}
		System.out.println(l+","+r);
		return null;
	}

}
