package com.kodnest.swaping;

public class SwapNumbers {
	public static int Display(int num1,int num2)
	{
		int temp;
		System.out.println("Before swaping of numbers:"+num1+" "+num2);
		//writing the logic
		temp=num1;
		num1=num2;
		num2=temp;
		//printing after swap  of numbers
		System.out.println("After swaping of numbers:"+num1+" "+num2);
		return 0;
	}

}
