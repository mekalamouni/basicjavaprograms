package com.mouni.basicprograms;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				sum=sum+i;
			}}
			System.out.println("sum is="+sum);
		}

	
	static boolean isPrime(int n) {
		if(n<=1)return false;
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}

}
