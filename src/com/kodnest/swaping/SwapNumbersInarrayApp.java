package com.kodnest.swaping;
import java.util.Scanner;
public class SwapNumbersInarrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array");
		//creating an array
		int[]arr=new int[scan.nextInt()];
		//Storing the elements in array
		System.out.println("Enter "+arr.length+"no of elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//taking the indexes to be swap
		System.out.println("enter  two indexes in the range of 0 to"+(arr.length-1));
		int i1=scan.nextInt();
		int i2=scan.nextInt();
	    int temp;
	     //Displaying the array elements
		   System.out.println("before swaping of numbers");
		   for(int x:arr)
		   {
			   System.out.print(x+" ");
			   
		   }
		   //logic will be writing here
		   temp=arr[i1];
		   arr[i1]=arr[i2];
		   arr[i2]=temp;
		   System.out.println("After swaping of numbers");
		   for(int x:arr)
		   {
			   System.out.print(x+" ");
			   
		   }
		  

	}

}
