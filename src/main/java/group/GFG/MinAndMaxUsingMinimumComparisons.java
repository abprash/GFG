package com.gfg.www;

import java.util.Arrays;

public class MinAndMaxUsingMinimumComparisons {

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000, 1000, 11, 445, 1, 330, 3000, 1000, 11, 445, 1, 330, 3000, 1000, 11,
				445, 1, 330, 3000, 4000 };
		System.out.println("-->the pair method--" + Arrays.toString(findMinAndMaxMinimumComparisons(arr)));
		System.out.println("-->the normal method--" + Arrays.toString(findMinAndMaxNormalMethod(arr)));
		findMinMax(arr);
	}

	public static int[] findMinAndMaxMinimumComparisons(int[] arr) {
		if (arr == null)
			return null;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, c = 0, a = 0, b = 0;
		int i = 0;
		if ((arr.length % 2) != 0) {
			//i = 0;

			min = arr[i];
			max = arr[i];
			i = 1;
		} else {
			//i = 0;
			a = arr[i];
			b = arr[i + 1];
			if (a < b) {
				c++;
				min = a;
				max = b;
			} else {
				c++;
				max = a;
				min = b;
			}
			i = 2;
		}

		while (i < arr.length - 1) {
			//System.out.println("i-"+i);
			a = arr[i];
			b = arr[i + 1];
			c++;
			if (a>b) {
				min = Math.min(b, min);
				max = Math.max(a, max);
				c += 2;
			}
			else {
				min = Math.min(a, min);
				max = Math.max(b, max);
				c += 2;
			}

			++i;
			++i;
		}
		return new int[] { min, max, c };
	}

	public static int[] findMinAndMaxNormalMethod(int[] arr) {
		if (arr == null)
			return null;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				//c++;
			} else if (arr[i] > max) {
				max = arr[i];
				//c++;
			}
			//c++;
			c+=2;
		}
		return new int[] { min, max, c };
	}
	
	private static void findMinMax(int[] arr) {
	    int len = arr.length;
	 
	    int count = 0; // Counter for comparisons
	    int min, max, start;
	 
	    count++;
	    // Set the initial max and min elements
	    if (len % 2 == 0) {
	        count++;
	        if (arr[0] < arr[1]) {
	        min = arr[0];
	        max = arr[1];
	        } else {
	        min = arr[1];
	        max = arr[0];
	        }
	        start = 2;
	    } else {
	        min = max = arr[0];
	        start = 1;
	    }
	 
	    // Iterate over rest of the array.
	    for (int i = start; i < arr.length - 1; i = i + 2) {
	        count++;
	        if (arr[i] > arr[i + 1]) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	        if (arr[i + 1] < min) {
	            min = arr[i + 1];
	        }
	        count++;
	        count++;
	        } else {
	        if (arr[i + 1] > max) {
	            max = arr[i + 1];
	        }
	 
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	        count++;
	        count++;
	        }
	    }
	 
	    System.out.println("Max: " + max);
	    System.out.println("Min: " + min);
	    System.out.println("Comparisons: " + count);
	    }
}
