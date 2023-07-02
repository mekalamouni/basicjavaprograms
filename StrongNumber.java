package com.mouni.basicprograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int temp=n;
		int rem;
		int sum=0;
		while(n>0) {
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Strong");
		}
		else {
			System.out.println("not Strong");
		}
		
		

	}

}
