package com.mouni.basicprograms;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int product=n*n;
		int sum=0;
		while(product>0) {
			int rem=product%10;
			sum=sum+rem;
			product=product/10;
			
			
			
		}
		if(n==sum) {
			System.out.println("Neon");
		}
		else {
			System.out.println("Not Neon");
		}

	}

}
