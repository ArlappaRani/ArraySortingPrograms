package com.arrays.binaysearch;
import java.util.Scanner;


public class BinarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		//creating an array
		int[]arr=new int[size];
		//Storing the elements in array
		System.out.println("Enter the elements to be stored in array"+arr.length);
		for(int i=0;i<=arr.length-1;i++)
		{
		
			arr[i]=scan.nextInt();
			
		}
		//taking a key to be search element in array
		System.out.println("Enter the element to be searched");
		int key=scan.nextInt();
      //calling the linear search method
		System.out.println(BinarySearch.SearchElement(arr,key));
	}



	

	}


