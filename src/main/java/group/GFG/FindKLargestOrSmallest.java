package com.gfg.www;

import java.util.Collections;
import java.util.PriorityQueue;

	
public class FindKLargestOrSmallest {
	
	public static void main(String[] args){
		int[] arr = {23,45,2,14,34,22,9,45,-1,-22,-43};
		findKSmallest(arr, 4);
	}
	public static void findKSmallest(int[] arr, int k){
		if(arr == null)
			return;
		//max heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		//min heap
		//PriorityQueue<Integer> pq_min = new PriorityQueue<Integer>();
		for(int i: arr){
			pq.add(i);
		}
		for(int i=0; i<k; i++){
			System.out.println(pq.poll());
		}
	}

}
