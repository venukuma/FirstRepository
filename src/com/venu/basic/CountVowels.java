package com.venu.basic;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		countVowels();

	}

	private static void countVowels() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = scan.next();
		scan.close();
		s = s.toLowerCase();
		int vowels = 0, consonants = 0, digits = 0;
		char letters[] = new char[20];
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;
			}

		}
		System.out.println("No of Vowels in the word is : " + vowels);
		System.out.println("No of Consonants in the word is : " + consonants);
		System.out.println("No of Digits in the word is : " + digits);
		System.out.println("letters "+letters);
	}

}
