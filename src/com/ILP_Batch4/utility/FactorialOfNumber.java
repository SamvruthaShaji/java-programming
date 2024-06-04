package com.ILP_Batch4.utility;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int input = 3;
		// factorialOfNumber(input);
		inverseFactorial(input);
	}

	public static void factorialOfNumber(int input) {
		int factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	public static void inverseFactorial(int input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum = sum + (i / factorial(i));
		}
		System.out.println(sum);
	}

	public static float factorial(int input) {
		float factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
