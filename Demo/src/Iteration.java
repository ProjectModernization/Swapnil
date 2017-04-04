package com.test.modernization.Demo;
import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1,num2,result = 0; 
		char operator;
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		num2 = scan.nextInt();
		System.out.println("Enter the operator (+ or *): ");
		operator = scan.next().charAt(0);
		Iteration obj = new Iteration();
		if(operator == '+'){
			result = obj.addition(num1, num2);
		}
		else if(operator == '*'){
			result = obj.multiply(num1, num2);
		}
		
		System.out.println("Results is "+ result);
		

	}
	public int multiply(int num1,int num2){
		return num1 * num2;
	}
	public int addition(int num1,int num2){
		return num1 + num2;
	}

}
