package com.venu.basic;

import java.util.Scanner;

/*
 *   XOR gate
 *   			sum	  carry					   1
 *   0 	0   0	 0		0					11001  -- b1
 *   0	0	1    1		0					10101  -- b2
 *   0	1	0	 1		0				  ------------
 *   0	1	1	 0		1					101110
 *   1	0	0	 1		0
 *   1	0	1	 0		1
 *   1	1	0	 0		1
 *   1	1	1	 1		1
 */


public class BinaryAddition {

	public static void main(String[] args) {

		binaryAddition();
	}

	public static void binaryAddition() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st Binary number");
		int b1 = scanner.nextInt();

		System.out.println("Enter 2nd Binary number");
		int b2 = scanner.nextInt();
		scanner.close();
		int arr[] = new int[10];
		int digi1, digi2, sum = 0, carry = 0;

		for (int i = arr.length - 1; i >= 0; i--) { // consider from last digits
			digi1 = b1 % 10; // for last digit //1
			digi2 = b2 % 10; // 1

			b1 = b1 / 10; // 1100
			b2 = b2 / 10; // 1010
			sum = digi1 + digi2 + carry; // 2
			if (sum == 0) {
				arr[i] = 0;
				carry = 0;
			} else if (sum == 1) {
				arr[i] = 1;
				carry = 0;
			} else if (sum == 2) {
				arr[i] = 0;
				carry = 1;

			} else if (sum == 3) {
				arr[i] = 1;
				carry = 1;
			}

		}
		for (int j = 0; j <= arr.length - 1; j++) {
			System.out.print(arr[j]);
		}

	}

}
