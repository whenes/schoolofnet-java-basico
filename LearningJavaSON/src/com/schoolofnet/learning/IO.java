package com.schoolofnet.learning;

import java.util.Scanner;

public class IO {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);//input
		System.out.println("What's your name?");//output
		String name = reader.nextLine();//input
		System.err.println("Nice to meet you, " + name + ".");//output
	}
}
