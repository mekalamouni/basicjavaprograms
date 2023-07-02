package com.mouni.basicprograms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    System.out.println("enter a number");
	    int n=scn.nextInt();
	    if(isPrime(n)) {
	    	System.out.println("prime number");
	    }
	    else {
	    	System.out.println("not prime");
	    }

	}
	static boolean isPrime(int n) {
		if(n<=1)return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				return false;
		
			
		}
		return true;
	}

}
