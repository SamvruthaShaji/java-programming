package com.ILP_Batch4.utility;

public class Pattern1 {

	public static void main(String[] args) {
		
		
		int input =5;
		//pattern1(input);
		//pattern(input);
		pattern2(input);
	}
	private static void pattern2(int input) {
		for (int i = 1; i <= input; i++) {
			char a =65;
			int number =1;
			for (int j = 1; j <= i; j++) {
				if(j%2==0) {
				System.out.print(a++ +" ");
				}
				else {
					System.out.print(number++ +" ");
				}
			}
			System.out.println();
		}
	}
	private static void pattern1(int input) {
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern(int input) {
		for(int i=1;i<=input;i++) {
			System.out.println();
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print(j);
				}
			else if(j%2==0) {
					System.out.print("  "+j);
				}
				else {
					System.out.print(" "+j);
				}
			}
		}
	}
	
	
}
