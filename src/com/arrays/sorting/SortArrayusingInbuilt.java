package com.arrays.sorting;
import java.util.Arrays;
import java.util.Scanner;
public class SortArrayusingInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		//creating an array
		int[]arr=new int[scan.nextInt()];
		//storing the elements in array
		System.out.println("enter"+arr.length+"numbers in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Sorting the using in built method is Arrays.sort
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		

	}

}
