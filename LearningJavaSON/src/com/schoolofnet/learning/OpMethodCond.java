package com.schoolofnet.learning;

import java.util.Scanner;

public class OpMethodCond {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number one: ");
		Integer num1 = scanner.nextInt();
		System.out.println("Number two: ");
		Integer num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Operation (+, -, *, /): ");
		String op = scanner.nextLine();
		
		
		if (op.equals("+")) {
			System.out.println("Sum: " + sum(num1, num2));			
		} else if (op.equals("-")) {
			System.out.println("Sub: " + sub(num1, num2));
		} else if (op.equals("*")) {
			System.out.println("Times: " + times(num1, num2));			
		} else if (op.equals("/")) {
			System.out.println("Div: " + div(num1, num2));			
		} else {
			System.out.println("Could not find operation.");
		}
		
		// ternary
		String a = "b";
		Boolean res = a.equals("b") ? true : false;
		System.out.println(res);

		/* operators
		 * >	maior
		 * >=	maior ou igual
		 * <	menor
		 * <=	menor ou igual
		 * ==	igual (referência de memória)
		 * !=	diferente
		 * !	negação
		 */
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
