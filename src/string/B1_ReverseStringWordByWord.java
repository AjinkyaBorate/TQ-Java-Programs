package string;

import java.util.Arrays;

//1. Reverse the string word by word
public class B1_ReverseStringWordByWord {
	public static void main(String[] args) {
		String input = "i love java";
		String result = reverseWords(input);
		System.out.println("Reversed string word by word:");
		System.out.println(result);
	}

	public static String reverseWords(String str) {
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		String result = "";
		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i];
			result += " ";
		}
		return result;
	}
}
