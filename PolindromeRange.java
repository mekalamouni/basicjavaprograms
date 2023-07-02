package com.mouni.basicprograms;

import java.util.Scanner;

public class PolindromeRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a  first number");
		int a=scn.nextInt();
		System.out.println("enter a second number");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++) {
			if(isPolindrome(i)) {
				System.out.println(i);
			
			}
		}

	}
	static boolean isPolindrome(int n) {
		int temp=n;
		int sum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
	}

}
