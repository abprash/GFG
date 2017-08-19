package com.gfg.www;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	public static void main(String[] args)
	{
		int[] a = {1,1,2,4,5,5,5,5,5,5,34};
		int[] b = {5,30,40,46,46,46,48,256};
		//merge two sorted arrays
		
		//keep two pointers in arr1 and 2
		//
		int[] c = mergeTwoSortedArrays(a,b);
		System.out.println(Arrays.toString(c));
		
	}
	
	public static int[] mergeTwoSortedArrays(int[] a, int[] b){
		if(a==null)
			return b;
		if(b==null)
			return a;
		if(a==null && b==null)
			return null;
		int[] c = new int[a.length + b.length];
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		while(p1<a.length && p2<b.length){
			//even if one reaaches the last point in its array - break
			if(a[p1] < b[p2]){
				c[p3] = a[p1];
				p3++;
				p1++;
			}
			else if(a[p1] > b[p2]){
				c[p3] = b[p2];
				p3++;
				p2++;
			}
			else if(a[p1] == b[p2]){
				c[p3] = a[p1];
				p3++;
				c[p3] = b[p2];
				p3++;
				p1++;
				p2++;
			}
		}
		//check if there are any remaining elements
		if(p1<a.length || p2<b.length)
		{
			//one of the arrays at least hasn't been traversed fully yet
			if(p1<a.length){
				//array a still remains
				//dump the rest of elements into c
				while(p1<a.length){
					c[p3] = a[p1];
					p1++;
					p3++;
				}
			}
			else if(p2<b.length){
				while(p2<b.length){
					c[p3] = b[p2];
					p2++;
					p3++;
				}
			}
			
		}
		return c;
	}
	

}
