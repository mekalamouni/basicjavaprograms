package com.mouni.basicprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(n+"!="+fact);

	}

}
