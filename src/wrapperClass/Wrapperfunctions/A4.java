package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*
 * 4.Write a program that takes a string input from the user and counts the number of digits and letters 
 * using the Character wrapper class. Print the counts.*/
public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		sc.close();
		int digit = 0, charcount = 0, symbol = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			Character c = Character.valueOf(ch);
			if (c >= 'a' && c <= 'z') {
				charcount++;
			} else if (c >= '0' && c <= '9') {
				digit++;
			} else {
				symbol++;
			}
		}
		System.out.println("Character count: " + charcount);
		System.out.println("Digit count: " + digit);
		System.out.println("Symbol count: " + symbol);

	}

}
