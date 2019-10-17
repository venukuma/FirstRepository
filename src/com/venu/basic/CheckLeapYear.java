package com.venu.basic;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {

		CheckLeapYear leapYear = new CheckLeapYear();
		boolean isLeapYear = leapYear.isLeapYear();
		if (isLeapYear) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}

	}

	private boolean isLeapYear() {
		boolean isLeap = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to check leap year or not");

		int year = scan.nextInt();
		scan.close();
		if (year % 4 == 0) {
			isLeap = true;
		}
		return isLeap;
	}

}
