package com.gfg.www;

public class FindingNumberInSortedRotatedArray {
	
	public static void main(String[] args){
		//do an improvised binary search
		int[] arr = {3,4,5,6,7,8,1,2};
		System.out.println(arr[findElementInSRArray(arr,0,arr.length-1,2)]);
	}
	
	public static int findElementInSRArray(int[] arr,int low, int high, int target){
		//findElementInSortedRotatedArray
		if(arr == null)
			return -1;
		//do a binary search
		int mid = low+high/2;
		if(arr[mid] == target)
			return mid;
		else if(arr[low] <= arr[mid]){
			//check if array is sorted
			
			//check if this is within our required bounds
			//this is our array
			if(target<=arr[mid] && target >=arr[low]){
				//this is our array
				return findElementInSRArray(arr, low,mid, target);
			}
			else
			{
				//dont search here
				return findElementInSRArray(arr, mid+1, high, target);
				
			}
			
		}
		else{
			//check if this array is sorted
			if(target >= arr[mid] && target <= arr[high])
			{
				return findElementInSRArray(arr,mid, high, target);
			}
			else
			{
				//element
				return findElementInSRArray(arr, low,mid-1, target);
			}
		}
	}

}
