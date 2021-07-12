package com.logicalprog;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args)   
	{  
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number");
			int number = sc.nextInt();
			int reverse = 0;  
			while(number != 0)   
			{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
			}  
			System.out.println("The reverse of the given number is: " + reverse);
		}  
		}  
}