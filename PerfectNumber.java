package com.mouni.basicprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int sum=0;
		int temp=n;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)sum=sum+i;
		}
		if(sum==temp) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}



}}

