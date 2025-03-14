package com.algo.learn;


import java.util.ArrayList;
import java.util.List;

public class RecursionArray {
    
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,7,5};

		
		List<Integer> lists = linearSearchMultipleTarget(arr, 7, 0, new ArrayList<>() );
		System.out.println(lists);
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
	
	
	public static List<Integer> linearSearchMultipleTarget(int[] arr, int target, int index, List<Integer> results) {
		  
		  
		  
		  if(index > arr.length-1  ) {
			  return results;
		  }
		
		  if(arr[index] == target) {
			  results.add(index);
		  }		  
		
		  
		  return linearSearchMultipleTarget(arr, target, index+1, results);
		  		  
	}
	
	/*
	public static List<Integer> linearSearchMultipleTargetAndResultInsideBody(int[] arr, int target, int index) {
		  	  
		  List<Integer> result = new ArrayList<Integer>();
		  if(index > arr.length-1  ) {
			  return null;
		  }
		
		  if(arr[index] == target) {
			  result.add(index);
			  return result;
		  }		  
		
		  
		  List<Integer> individualResult =  linearSearchMultipleTargetAndResultInsideBody(arr, target, index+1);		  
		  
		  
	}*/

	
	
}
