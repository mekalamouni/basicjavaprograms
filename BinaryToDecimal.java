package com.mouni.basicprograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int bin=scn.nextInt();
		int i=1;
		int dec=0;
		while(bin!=0) {
			 int rem=bin%10;
			 dec=dec+rem*i;
			 i=i*2;
			 bin=bin/10;
			 
			
		}
		System.out.println(dec);

	}

}
