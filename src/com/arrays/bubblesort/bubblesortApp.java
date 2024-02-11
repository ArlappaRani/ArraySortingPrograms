package com.arrays.bubblesort;
import java.util.Scanner;
public class bubblesortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println( "Enter the size of an array");  
		//creating an array
		int[]arr=new int[scan.nextInt()];
		//Storing the data in array
		System.out.println("enter"+arr.length+"elements in array");
		//loop for storing the elements in array from 0 to last element
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//Displaying the elements before sorting
		System.out.println("Before sorted elements are:");
		//will take for each loop because we just traversing the elements
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println(); 
		//performing sorting
		int[] Sortedarr=bubblesort.SortingBubble(arr);
				
		//Displaying the elements before sorting
		System.out.println("After sorted elements are:");
		//will take for each loop because we just traversing the elements
		for(int x:Sortedarr)
		{
			System.out.print(x+" ");
		}
		

	}

}
