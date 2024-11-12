package string;

//Write a Java program to remove all extra blank spaces from a given string.
public class B6_RemoveXtraSpaceFromString {
	public static void main(String[] args) {
		String input = "hi      ajinkya   how       are  you";
		String result = removeExtraSpaces(input);

		System.out.println("String after removing extra spaces:");
		System.out.println(result);
	}
	public static String removeExtraSpaces(String str) {
		str = str.trim();
		String result = "";
		boolean spaceFound = false;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if (currentChar == ' ') {
				if (!spaceFound) {
					result += currentChar;
					spaceFound = true; 
				}
			} else {
				result += currentChar;
				spaceFound = false;
			}
		}

		return result;
	}

}
