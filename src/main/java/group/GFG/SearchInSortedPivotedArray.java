package com.gfg.www;

public class SearchInSortedPivotedArray {
	public static void main(String[] args){
		int[] a = {1,1,2,4,5,5,5,5,5,5,3,5,3,4,46,43,46,43,2};
		int res = pivotedBinarySearch(a,0,a.length-1,5);
		System.out.println(res);
	}
	public static int pivotedBinarySearch(int[] arr,int start, int end, int target){
		if(arr == null)
			return 0;
		int pivot = findPivot(arr,start,end);
		if(pivot == -1)
			return binarySearch(arr,start,end,target); // the array is fully sorted anyway, so just return
		if(arr[pivot] < target)
			return binarySearch(arr,pivot+1,end,target);
		else
			return binarySearch(arr, 0,pivot,target);
	}
	
	public static int findPivot(int[] arr, int start, int end){
		if(start > end)	return -1;
		if(start == end)	return start;
		//find the first element where the elt is greater than prev elt
		int mid = (start + end )/ 2;
		if(mid< end && arr[mid] > arr[mid+1])
			return mid;
		if(mid>start && arr[mid]<arr[mid-1])
			return mid-1;
		if(arr[start] > arr[end])
			return findPivot(arr,start,mid-1);
		return findPivot(arr,mid,end);
	}
	
	public static int binarySearch(int[] arr, int low, int high, int target){
		if(low>high)	return -1;
		int mid = (low+high)/2;
		if(arr[mid] == target)
			return mid;
		else if(arr[mid] < target)
			return binarySearch(arr,mid+1,high,target);
		else
			return binarySearch(arr,low,mid,target);
	}

}
