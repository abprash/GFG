package com.gfg.www;

public class MajorityElement {
	public static void main(String[] args){
		int[] a = {1,1,2,4,5,5,5,5,5,5,3,5,3,4,4,4,4,4,4,4,4,4,4,4,4,46,43,46,43,2,4,4,4,4};
		System.out.println(majorityElement(a));
	}
	public static int majorityElement(int[] arr){
		int maxNum = 0, maxFreq = 0;
		if(arr == null)
			return 0;
		for(int i=0 ;i<arr.length; i++){
			if(i==0){
			maxNum = arr[i];
			maxFreq++;
			}
			else{
				if(arr[i] == maxNum)
					maxFreq++;
				else
				{
					//maxNum = arr[i];
					if(maxFreq == 0){
						maxNum = arr[i];
						maxFreq = 1;
					}
					else
						maxFreq--;
					
				}
			}
			System.out.println("max num is "+maxNum+"\n");
			System.out.println("max freq is "+maxFreq+"\n");
		}
		//now we have the candidate element in maxNum
		System.out.println("max num of times elt is "+maxNum+"\n");
		System.out.println("\n confirming now");
		int count=0;
		for(int i=0 ;i<arr.length; i++){
			if(arr[i] == maxNum)
				count++;
			System.out.println("i="+i+",count="+count);
		}
		if(count > (arr.length)/2)
			System.out.println("yes confirmed- "+maxNum);
		else
			System.out.println("count--"+count+"array/2--"+33/2);
		if(17>(33/2))
			System.out.println("ok");
		return maxNum;
	}
	
	
	/*
	public static int majorityElement(int[] arr){
		if(arr == null)
			return 0;
		Arrays.sort(arr);
		int currCount = 1, maxCount  = 0;
		int elt = 0;
		for(int i=1; i<arr.length ; i++){
			if(arr[i] == arr[i-1])
				currCount++;
			else{
				if(currCount > maxCount){
					maxCount = currCount;
					elt = arr[i-1];
				}
				currCount = 0;
				if(maxCount > (arr.length/2))
					return maxCount;
			}
		}
		System.out.println(elt);
		return elt;
	}*/
	
	//using Moore's voting algorithm
	public static int majorityElement2(int[] arr){
		if(arr == null)
			return 0;
		int majIndex = 0;
		int count  = 1;
		for(int i=0; i<arr.length-1 ; i++){
			if(arr[i] == arr[i+1])
				count++;
			if(arr[i] != arr[i+1])
				count--;
			if(count == 0)
			{
				majIndex = i;
				count = 1;
			}
		}
		return arr[majIndex];
	}
}
