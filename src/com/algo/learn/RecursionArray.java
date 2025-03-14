package com.algo.learn;

public class RecursionArray {
    
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5};
		//System.out.println(isSorted(arr, 0));
		
		System.out.print(linearSearch(arr,15, 0));
	}
	
	public static boolean isSorted(int[] arr, int index) {
		
		if(index >= arr.length-1) {
			return true;
		}
		
		if(arr[index] > arr[index + 1] ) {
			return false;
		}
		
		return isSorted(arr, index+1);
	}
	
	
	public static int linearSearch(int[] arr, int target, int index) {
		
		  if(index > arr.length-1  ) {
			  return -1;
		  }
		
		  if(arr[index] == target) {
			  return index;
		  }		  
		
		  
		  return linearSearch(arr, target, index+1);
	}
}
