package com.venu.basic;

import java.util.Scanner;

public class Add2Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = scanner.nextInt();
		System.out.println("Enter 2nd Number");
		int b = scanner.nextInt();
		Add2Numbers numbers = new Add2Numbers();
		int result = numbers.addNumbers(a, b);
		System.out.println("Addition of two numbers is : " + result);
		scanner.close();

	}

	public int addNumbers(int a, int b) {
		return a + b;

	}

}
