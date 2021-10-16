package com.logicalprog;

import java.util.Scanner;

public class CouponNum {
	   public static void main(String[] args) {
	        int dist = 1, count = 0;
	        System.out.print("Enter the Total no of coupons Num : ");
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] coupon = new int[n];

	        while (dist <= n) {
	            int value = (int) (Math.random() * n);
	            count++;
	            System.out.println("Generated value " + (value + 1));
	            if (coupon[value] != value + 1) {
	                dist++;
	                coupon[value] = value + 1;
	            }
	        }
	        System.out.println("Total no of trials to get "+n+" diffrent coupon number's are "+count);
	        System.out.println(" ");
	        System.out.println("Array : ");
	        for (int i=0; i<n; i++){
	            System.out.println(i+" elements in the array is "+coupon[i]);


	        }

	   }
}


