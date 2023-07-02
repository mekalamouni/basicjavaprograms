package com.mouni.basicprograms;

import java.util.Scanner;

public class BiggestPrime {

	public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter a first number");
	  int a=scn.nextInt();
	  System.out.println("enter a second number");
	  int b=scn.nextInt();
	  for(int i=b;i>=a;i--) {
		  if(isPrime(i)) {
		  System.out.println(i);
		  break;
	  }
	  }
	  

	}
	static boolean isPrime(int n) {
		if(n<=1)return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
				
		}
		return true;
	}

}
