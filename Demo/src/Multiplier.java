package com.test.modernization.Demo;

import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {
		int num1,num2;
		
		Multiplier obj = new Multiplier();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number  (1 digit) : ");
		num1 = scan.nextInt();

		System.out.println("Enter second number (1 digit) : ");
		num2 = scan.nextInt();
		int result = obj.multiply(num1,num2);
		System.out.println("Result is = " + result );
	}
	public int multiply(int num1, int num2){
		return num1 * num2;
	}

}

