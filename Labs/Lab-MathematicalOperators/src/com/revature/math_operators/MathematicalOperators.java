package com.revature.math_operators;

public class MathematicalOperators {
	public static void main(String[] args) {
		//define variables
		int x = 5;
		int y = 3;
		int z;

		//simple addition
		z = x + y;
		System.out.println(z);
		
		//simple subtraction
		z = x - y;
		System.out.println(z);
		
		//simple multiplication
		z = x * y;
		System.out.println(z);
		
		//simple division
		z = x / y;
		System.out.println(z);
		
		//simple modulus
		z = x % y;
		System.out.println(z);
		
		//float vs. int
		float f = 3.6f;
		int i = 22;
		//int result = (int)f + i;
		//long result = (long) (f + i);
		//double result = f + i;
		double result = (double) (f + i);
		System.out.println(result);
				
	}
}
