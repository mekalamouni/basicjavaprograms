package com.mouni.basicprograms;

import java.util.Scanner;

public class RangeOfFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a first number");
		int m=scn.nextInt();
		System.out.println("enter a second number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		if(m==0) {
			System.out.println(0);
			return;
		}
		System.out.print(a+" "+b);
		while(true) {
			c=a+b;
			if(c>=n) {
				break;
			}
			System.out.print(" "+c);
			if(c>=m) {
				a=b;
				b=c;
			}
		}
		
	}

}
