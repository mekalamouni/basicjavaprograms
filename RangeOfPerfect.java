package com.mouni.basicprograms;

import java.util.Scanner;

public class RangeOfPerfect {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a first number");
		int a=scn.nextInt();
		System.out.println("enter a second number");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++) {
			if(isPerfect(i)) {
				System.out.println(i);
			}
		}}
		static boolean isPerfect(int m) {
			int sum=0;
			int temp=m;
			for(int i=1;i<=temp/2;i++) {
				if(temp%i==0) {
				sum=sum+i;
			}
			
		}
			if(sum==temp) {
				return true;
			}
			return false;
		
		}
	}


