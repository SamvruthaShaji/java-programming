package com.ILP_Batch4.utility;

public class SumOfSeries {

	public static void main(String[] args) {
		int input =10;
	sumOfTheSeries(input);
	
	}
private static void sumOfTheSeries(int input) {
		int sum = 0;
		for(int i=1;i<=input;i++) {
			
			sum +=i;
			
		}
		System.out.println("The sum is: "+sum);
	}

}
