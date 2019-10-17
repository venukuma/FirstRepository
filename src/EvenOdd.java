import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		EvenOdd evenOdd = new EvenOdd();
		evenOdd.findEvenOrOdd();

	}

	private void findEvenOrOdd() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number to check Even or Odd");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("Entered Number is Even Number");
		} else {
			System.out.println("Entered Number is Odd Number");
		}
		scanner.close();

	}

}
