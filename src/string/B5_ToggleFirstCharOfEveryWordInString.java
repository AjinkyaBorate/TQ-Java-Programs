package string;

//Write a Java program to toggle case first character of every word  of a string.
public class B5_ToggleFirstCharOfEveryWordInString {

	public static void main(String[] args) {

		String input = "hi hello how are you";
		String[] words = input.split("\\s+");

		String result = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.length() > 0) {
				char firstChar = word.charAt(0);

				if (Character.isLowerCase(firstChar)) {
					result += Character.toUpperCase(firstChar);
				} else if (Character.isUpperCase(firstChar)) {
					result += Character.toLowerCase(firstChar);
				}
				result += word.substring(1);
			}
			if (i < words.length - 1) {
				result += " ";
			}
		}
		System.out.print("Result: " + result);

	}

}
