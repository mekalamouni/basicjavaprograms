package com.mouni.basicprograms;

import java.util.Scanner;

public class polindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int temp=n;
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("polindrome");
		}
		else {
			System.out.println("not polindrome");
		}

	}

}
