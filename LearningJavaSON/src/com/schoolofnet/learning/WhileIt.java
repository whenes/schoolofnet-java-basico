package com.schoolofnet.learning;

public class WhileIt {
	public static void main(String[] args) {
		Integer counter = 0;
		
		while (counter <= 7) {
			System.out.println(counter);
			counter++;
		}		
		
		counter = 0;
		
		do { //executa ao menos uma vez
			System.out.println(counter);
			counter++;
		} while (counter <= 0);
	}
}
