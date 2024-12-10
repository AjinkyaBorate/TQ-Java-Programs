package string;

// Write a program to sort string arrays on the basis of length and if length is same then lexicographically
public class B2_SortStringArraybyLength {
	public static void sortstrByLength(String str[]) {
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = 0; j < str.length - 1 - i; j++) {

				if (str[j].length() > str[j + 1].length()
						|| (str[j].length() == str[j + 1].length() && str[j].compareTo(str[j + 1]) > 0)) {
					String temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		String str[] = { "hbc", "zefgq", "ahi", "yqrst" };
		sortstrByLength(str);
		for (int i = 0; i < str.length; i++) {
			String st = str[i];
			System.out.print(st + " ");
		}
	}
}
