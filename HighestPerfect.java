package com.mouni.basicprograms;

import java.util.Scanner;

public class HighestPerfect {

	public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("enter a first number");
	 int a=scn.nextInt();
	 System.out.println("enter a second number");
	 int b=scn.nextInt();
	 for(int i=b;i>=a;i--) {
		 if(isPerfect(i)) {
			 System.out.println(i);
			 break;
		 }
	 }

	}
	static boolean isPerfect(int n) {
		int temp=n;
		int sum=0;
		for(int i=1;i<=temp/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}

}
