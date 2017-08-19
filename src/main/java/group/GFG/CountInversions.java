package com.gfg.www;

public class CountInversions {
	
	//enhanced merge sort to take care of number of counts
	//O(n^2) trivial approach is also there to get this done
	//so we are going for a much more optimized way
	
	public static int mergeSort(int[] arr, int[] temp, int low, int high){
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		int invCount = 0;
		invCount = mergeSort(arr, temp, low, mid);
		invCount+= mergeSort(arr, temp, mid+1, high);
		
		
		//now the merging part
		invCount+= merge(arr,temp,low,mid+1,high);
		return invCount;
	}
	
	public static int merge(int[] arr, int[] temp, int low, int mid, int high){
		//
		int i = low;
		int j = mid;
		int k = low;
		int invCount = 0;
		while((i<=mid-1) && (j<high)){
			if(arr[i] < arr[j]){
				temp[k] = arr[i];
				k++;
				i++;
			}
			else
			{
				//if arr[i] > arr[j]
				temp[k] = arr[j];
				k++;
				j++;
				invCount+= mid-i;
			}
		}
		//one might have run out of elements
		while(i<=mid-1){
			temp[k] = arr[i];
			k++;
			i++;
		}
		while(j<=high){
			temp[k] = arr[j];
			k++;
			j++;
		}
		
		for(int l=0; l<arr.length; l++)
			arr[l] = temp[l];
		
		
		return invCount;
		
	}
	
	public static void main(String[] args){
		int arr[] = {1, 20, 6, 4, 5};
		int[] temp = new int[arr.length];
		System.out.println(mergeSort(arr,temp,0,arr.length-1));
	}

}
