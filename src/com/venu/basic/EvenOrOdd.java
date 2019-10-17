package com.venu.basic;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		boolean isCheck = evenOrOdd.checkEvenOrOdd();
		if (isCheck) {
			System.out.println("Yes, It is a Even Number");
		} else {
			System.out.println("It is a odd Number");
		}

	}

	public boolean checkEvenOrOdd() {
		boolean isEven = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to check Even Or Odd");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			isEven = true;
		}
		scanner.close();
		return isEven;
	}

}
