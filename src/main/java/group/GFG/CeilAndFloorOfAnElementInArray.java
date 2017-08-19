package com.gfg.www;

//finding the ceiling and floor of an element in an array
public class CeilAndFloorOfAnElementInArray {
	
	public static void main(String[] args){
		//
		int[] arr = {1, 2, 8, 10, 10, 12, 19};
		System.out.println(findCeil(arr, 0, arr.length-1, 0));
		System.out.println(findCeil(arr, 0, arr.length-1, 1));
		System.out.println(findCeil(arr, 0, arr.length-1, 5));
		System.out.println(findCeil(arr, 0, arr.length-1, 20));
		System.out.println("---------");
		System.out.println(findFloor(arr, 0, arr.length-1, 0));
		System.out.println(findFloor(arr, 0, arr.length-1, 1));
		System.out.println(findFloor(arr, 0, arr.length-1, 5));
		System.out.println(findFloor(arr, 0, arr.length-1, 20));
	}
	public static int findCeil(int[] arr,int low, int high, int x){
		if(arr == null)
			return -1;
		//do binary search
		//check if first element is larger than x return first elt
		if(arr[low] >= x)
			return arr[low];
		//if last elt itself is smaller than x - return -1
		if(arr[high] < x)
			return -1;
		
		
		int mid = low+high/2;
		
		if(arr[mid] == x){
			System.out.println("ceil and floor are "+x);
			return arr[mid];
		}
		
		//else it may not be equal
		if(arr[mid] < x && arr[mid+1] >= x)
			return arr[mid+1];
		
		if(x < arr[mid])
			return findCeil(arr, low, mid, x);
		else
			return findCeil(arr, mid+1, high, x);
	}
	
	
	public static int findFloor(int[] arr,int low, int high, int x){
		if(arr == null)
			return -1;
		//do binary search
		//check if first element is larger than x return first elt
		if(arr[high] <= x)
			return arr[high];
		//if last elt itself is smaller than x - return -1
		/*if(arr[low] > x)
			return -1;*/
		if(arr[low] > x)
			return -1;
		
		int mid = low+high/2;
		
		if(arr[mid] == x){
			System.out.println("floor are "+x);
			return arr[mid];
		}
		
		//else it may not be equal
		if(arr[mid] < x && arr[mid+1] >= x)
			return arr[mid];
		
		if(x < arr[mid])
			return findFloor(arr, low, mid, x);
		else
			return findFloor(arr, mid+1, high, x);
	}

}
