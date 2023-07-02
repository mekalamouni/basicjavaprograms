package com.mouni.basicprograms;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scn.nextInt();
		int temp = n;
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;

		}
		System.out.println("len=" + count);
		n = temp;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			int product = 1;
			for (int i = 1; i <= count; i++) {
				product = product * digit;
			}
			sum = sum + product;
			// System.out.println(digit+"pow"+count+"="+product);
			n = n / 10;

		}
		System.out.println(sum);

		if (sum == temp) {
			System.out.println("Amstrong");
		} else {
			System.out.println("not Amstrong");
		}

	}
}
