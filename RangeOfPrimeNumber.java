package com.mouni.basicprograms;

import java.util.Scanner;

public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a first number");
		int a=scn.nextInt();
		System.out.println("enter a second Number");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				
			}
		}
		

	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}

}
