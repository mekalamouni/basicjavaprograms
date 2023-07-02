package com.mouni.basicprograms;

import java.util.Scanner;

public class FibnanciOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int a=0;
		int b =1;
		int c=0;
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
		}
	
	
	if(c==n) {
		System.out.println("fibnanaci");
	}
	else {
		System.out.println("not fibnanci");
	}
		
	}}



