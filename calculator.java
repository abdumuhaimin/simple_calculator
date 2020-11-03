package com.abdumuhaimin.src;

import java.util.Scanner;

public class Calculator {
	
	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		double firstNumber = reader.nextDouble();
		double secondNumber = reader.nextDouble();
		
		System.out.println("Enter an operator (+, -, *, /, %): ");
		char operator = reader.next().charAt(0);
		
		double result = 0;
		
		switch(operator) {
		case '+':
			result = firstNumber + secondNumber;
			break;
		case '-':
			result = firstNumber - secondNumber;
			break;
		case '*':
			result = firstNumber * secondNumber;
			break;
		case '/':
			result = firstNumber / secondNumber;
			break;
		case '%':
			result =  firstNumber % secondNumber;
			break;
		//kalau operation depa pelik
		default:
			System.out.println("Bagilah betul2 operation tu...");
			break;
		}
		System.out.printf("%1f %c %1f = %1f", firstNumber, operator, secondNumber, result);
	}
	
}
