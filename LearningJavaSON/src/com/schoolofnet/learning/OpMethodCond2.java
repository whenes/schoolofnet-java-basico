package com.schoolofnet.learning;

import java.util.Scanner;

public class OpMethodCond2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dia da semana (ex: 1, 2, 3, ...):");
		Integer day = scanner.nextInt();
		switch (day) {
			case 1:
				System.out.println("Segunda-feira");
				break;
			case 2:
				System.out.println("Terça-feira");
				break;
			case 3:
				System.out.println("Quarta-feira");
				break;
			case 4:
				System.out.println("Quinta-feira");
				break;
			case 5:
				System.out.println("Sexta-feira");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
		}
	}
}
