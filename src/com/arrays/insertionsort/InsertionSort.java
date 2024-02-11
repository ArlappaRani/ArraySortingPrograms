package com.arrays.insertionsort;

public class InsertionSort {
	public static int[] Sorting(int[]arr)
	{
		// loop start from 0 to arr.length-1
		for(int i=1;i<=arr.length-1;i++)
		{
			int j=i-1;
			int ele=arr[i];
			//if while condition is true then arr[j] will be pushed below 1 step
			//and j value will be decrement for j value will changes in each iteration
			while(j>=0 && arr[j]>=ele)
			{
				arr[j+1]=arr[j];
				j--;
			}
			//ele will be assigned to arr[j+1]
			arr[j+1]=ele;
			
		}
		//returning the array value
		return arr;
	}

}
