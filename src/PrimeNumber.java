import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber number = new PrimeNumber();
		number.checkPrimeNumber();

	}

	private void checkPrimeNumber() {

		int temp;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  a number to check prime or not");
		int number = scan.nextInt();
		scan.close();
		for (int i = 2; i <= number / 2; i++) {
			temp = number % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime) {
			System.out.println("it is a prime number");
		} else {
			System.out.println("it is not a prime number");
		}

	}

}
