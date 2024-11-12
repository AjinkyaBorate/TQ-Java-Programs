package string;

import java.util.Scanner;
//3.WAP to find the most repeated word in a string
public class B3_MostRepetedWordInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();

		input = input.toLowerCase();

		String[] words = input.split("\\s+");

		String mostRepeatedWord = "";
		int maxCount = 0;
		for (int i = 0; i < words.length; i++) {
			int count = 1;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostRepeatedWord = words[i];
			}
		}
		if (!mostRepeatedWord.isEmpty()) {
			System.out.println("The most repeated word is: " + mostRepeatedWord + " (repeated " + maxCount + " times)");
		} else {
			System.out.println("No repeated word found.");
		}

		scanner.close();
	}

}
