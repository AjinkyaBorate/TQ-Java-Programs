package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*
 * 3.Implement a program that takes a character input from the user. Use the Character wrapper class to check 
 * if the character is a vowel, a digit, or a whitespace character. Print appropriate messages based on the checks.*/
public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		Character c = Character.valueOf(ch);

		if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
			System.out.println(ch + " is Vowel");
		} else if (c >= 'a' && c <= 'z') {
			System.out.println(c + " is Consonant");

		} else if (c >= '0' && c <= '9') {
			System.out.println(c + " is Digit");
		} else {
			System.out.println(c + " is symbol");
		}

	}

}
