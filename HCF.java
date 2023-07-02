package com.mouni.basicprograms;

public class HCF {

	public static void main(String[] args) {
		int a=40;
		int b=60;
		int hcf=0;
		for(int i=1;i<=a;i++){
			
			if(a%i==0&&b%i==0) 
				hcf=i;
		}
			System.out.println(hcf);
		}

	}


