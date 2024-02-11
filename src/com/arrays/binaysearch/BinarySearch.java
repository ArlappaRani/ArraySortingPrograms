package com.arrays.binaysearch;

public class BinarySearch {
	public static String SearchElement(int[]arr,int key)
	{
		//initializing the mid,low,high
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		//loop for until the condition stop
		while(low<=high)
			//to check weather the key is present at mid 
		{
			mid=(low+high)/2;
		if(key==arr[mid])
		{
			return("the key present at index:"+mid);
		}
		//check the condition key is greater than mid
		else if(key>arr[mid])
		{
		 low=mid+1;
		 high=high;
		}
		//to check this condition for key is less than mid
		else
		{
			low=low;
			high=mid-1;
		}}
		//while condition is false then below statement will be executed
		return ("key is not found ");
	}
	}



