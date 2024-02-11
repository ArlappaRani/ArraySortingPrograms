package com.kodnest.swaping;

import java.util.Scanner;

public class SwapNumbersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner scan=new Scanner(System.in);
				System.out.println("Enter first number");
				int num1=scan.nextInt();
				System.out.println("Enter the second number");
				int num2=scan.nextInt();
	
				SwapNumbers.Display(num1,num2);

			}
	}


