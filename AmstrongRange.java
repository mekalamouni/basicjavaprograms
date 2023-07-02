package com.mouni.basicprograms;

import java.util.Scanner;

public class AmstrongRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a first number");
		int m=scn.nextInt();
		System.out.println("enter a second number");
		int n=scn.nextInt();
		for(int i=m;i<n;i++) {
			if(isAmstrong(i)) {
				System.out.println(i);
			}
			
		}
		

	}
	static boolean isAmstrong(int n) {
		int temp=n;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
			
		}
		n=temp;
		int sum=0;
		int prod=1;
		int rem=n%10;
		while(n>0) {
			prod=prod*rem;
			
		}
		sum=sum+prod;
	
	if(sum==temp) {
		return true;
	}
	else {
		return false;}
	}

}
