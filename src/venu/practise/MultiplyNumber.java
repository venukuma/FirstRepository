package venu.practise;

import java.util.Scanner;

public class MultiplyNumber {

	public static void main(String[] args) {

		MultiplyNumber number = new MultiplyNumber();
		number.checkMultiplication();

	}

	private void checkMultiplication() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number to check Multiplied by That number");
		int number = scanner.nextInt();

		for (int i = 2; i <= 11; i++) {
			if (number % i == 0) {
				System.out.println(number + " Is Multiplied by " + i);
			}

		}
		scanner.close();
	}

}
