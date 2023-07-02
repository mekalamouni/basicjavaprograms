package com.mouni.basicprograms;

import java.util.Scanner;

public class Fibnanci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		if(n==1) {
			System.out.print(0+" ");
			return;
		}
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		

	}
	

}
