package string;

//1. Reverse the string word by word
public class B1_ReverseStringWordByWord {
	public static void main(String[] args) {
		String input = "i love java";
		String result = reverseWords(input);
		System.out.println("Reversed string word by word:");
		System.out.println(result);
	}

	public static String reverseWords(String str) {
		String[] words = str.trim().split("\\s+");
		String result = "";
		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i];
			if (i > 0) {
				result += " ";
			}
		}

		return result;
	}
}
