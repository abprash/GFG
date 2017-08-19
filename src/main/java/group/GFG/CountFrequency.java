package com.gfg.www;

import java.util.Arrays;

public class CountFrequency 
{
    // Function to find counts of all elements present in
    // arr[0..n-1]. The array elements must be range from
    // 1 to n
    void printfrequency(int arr[], int n) 
    {
        // Subtract 1 from every element so that the elements
        // become in range from 0 to n-1
    	System.out.println("initial array \n"+Arrays.toString(arr)+"\n n value--"+n);
        for(int i=0; i<n ; i++){
        	//subtract 1 from every element
        	arr[i]-=1;
        	
        }
        //we put the elements occurrences according to their positions in the array
        for(int i=0; i<n; i++){
        	arr[arr[i]%n] = arr[arr[i]%n] + n;
        }
        
        for(int i=0; i<n; i++){
        	System.out.println(i+1+"-->"+arr[i]/n);
        }
        
    }
    
    
 
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        CountFrequency count = new CountFrequency();
        int arr[] = {2, 3, 3, 2, 5};
        int n = arr.length;
        count.printfrequency(arr, n);
        //printFrequencies(arr);
    }
}