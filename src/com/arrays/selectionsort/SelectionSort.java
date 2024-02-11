package com.arrays.selectionsort;

public class SelectionSort {
	public static int[] Sorting(int[]arr)
	{
		//starting the index  of i 0 to arr.length-2
		for(int i=0;i<=arr.length-2;i++)
		{
			//Assuming arr[i] is the minimum element and storing it
		int	min=arr[i];
			//storing the i value in position
		int pos=i;
		//checking all the elements after i
		for(int j=i+1;j<=arr.length-1;j++)
			{
			//if arr[j] is less than min will replace element and postion to min and pos
			if(arr[j]<min)
			{
				//Assigning arr[j] to min
				min=arr[j];
				//Assigning position of j to pos
				pos=j;
			}
			}
		  //Swapping the elements at i and pos
		int temp=arr[pos];
		arr[pos]=arr[i];
		arr[i]=temp;
		}
		//returning the sorted array
		return arr;
	}

}
