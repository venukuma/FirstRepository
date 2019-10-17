package com.venu.basic;

import java.util.Scanner;

public class PowerExponent {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = scan.nextInt(); // 2
		System.out.println("Enter a exponent number");
		int b = scan.nextInt(); // 5 2^5
		int newNum = 1;
		scan.close();
		for (int i = 1; i <= b; i++) {
			newNum = newNum * a;
		}
		System.out.println(newNum);

	}

}
