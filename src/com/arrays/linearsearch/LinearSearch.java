package com.arrays.linearsearch;

public class LinearSearch {
	//creating a static method
	public static String SearchElement(int[]arr,int key )
	{
		//loop to check all the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
		//checking the condition if key is present or not in array
		if(key==arr[i])
		{
			return("Key "+key+"is present at index"+i);
		}
		}
		
			return("key "+key+"is not present");
		}
	}


