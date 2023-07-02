package com.mouni.basicprograms;

public class Lcm {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int n=a>b?a:b;
	while(true) {
		if(n%a==0&&n%b==0) 
			
			break;
		n++;
		
	}
	System.out.println("lcm of "+a+"and"+b+"="+n);

	}

}
