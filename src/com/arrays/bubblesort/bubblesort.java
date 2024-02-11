package com.arrays.bubblesort;

public class bubblesort {
	public static int[] SortingBubble(int[]arr)
	{
		//taking temporary variable to performing sorting
		int temp;
		//picking all the elements in array
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//comparing the element with next index element
				//if its greater than next element swap it
				if(arr[j]>arr[j+1])
				{
				    temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//returning the array
		return arr;
	}

}
