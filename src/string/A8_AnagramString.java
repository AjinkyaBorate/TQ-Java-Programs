package string;

import java.util.Arrays;

//8.Check whether String is Anagram.
public class A8_AnagramString {
	public static void checkAnagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				System.out.println("Strings are anagram");
			}
		} else {
			System.out.println("Not anagram");
		}
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		checkAnagram(str1, str2);
	}

}
