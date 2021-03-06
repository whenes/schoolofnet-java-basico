package com.schoolofnet.learning;

import java.util.Scanner;

public class OpMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number one: ");
		Integer num1 = scanner.nextInt();
		System.out.println("Number two: ");
		Integer num2 = scanner.nextInt();
		
		System.out.println("Sum: " + sum(num1, num2));
		System.out.println("Sub: " + sub(num1, num2));
		System.out.println("Times: " + times(num1, num2));
		System.out.println("Div: " + div(num1, num2));
	}
	
	private static Integer sum(Integer num1, Integer num2) {
		return num1 + num2;
	}

	private static Integer sub(Integer num1, Integer num2) {
		return num1 - num2;
	}

	private static Integer times(Integer num1, Integer num2) {
		return num1 * num2;
	}

	private static Double div(Integer num1, Integer num2) {
		return (double) (num1 / num2);
	}
}
