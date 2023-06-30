package com.mouni.basicprograms;

import java.util.Scanner;

public class AlternativePrime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				i=i+2;
			}
		}

	}
	static boolean isPrime(int n) {
		if(n<=1)return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
