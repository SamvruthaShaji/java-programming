package com.ILP_Batch4.utility;

public class Right_pattern {
	public static void main(String[] args) {
		int input=4;
		pattern(input);
	}

	private static void pattern(int input) {
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
