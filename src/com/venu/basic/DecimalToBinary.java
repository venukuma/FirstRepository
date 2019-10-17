package com.venu.basic;

import java.util.Scanner;

// Convert Decimal to Binary

/*
 * 25-->
 *   25%2 = 12  rem = 1
 *   12%2 = 6   rem = 0
 *   6%2 = 3	rem = 0
 *   3%2 = 1	rem = 1
 *   1%2 = 0	rem = 1
 *   Binary --> 11001 
 */

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to convert into binary");
		int number = scanner.nextInt();
		scanner.close();
		int rem[] = new int[10];
		int index = 0;
		while(number>0){
			rem[index]=number%2;
			index++;
			number = number/2;
		}
		for(int i = (index-1);i>=0;i--) {
			System.out.print(rem[i]);
		}

	}

}
