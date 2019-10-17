package com.venu.basic;

import java.util.Scanner;

public class Multiply2Numbers {

	public static void main(String[] args) {

		Multiply2Numbers numbers = new Multiply2Numbers();
		int multiplication = (int) numbers.multiplyNum();
		System.out.println(multiplication);

	}

	public double multiplyNum() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 1st number");
		double num1 = scan.nextDouble();
		System.out.println("Enter a 2nd Number");
		double num2 = scan.nextDouble();
		scan.close();

		return num1 * num2;
	}

}
