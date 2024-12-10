package array_string_practice;

public class Q1 {
	public static void displayarray(String s[]) {
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

	public static void sortarray(String s[]) {
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].length() == s[j].length()) {
					if (s[i].compareTo(s[j]) > 0) {
						String temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				} else {
					if (s[i].length() > s[j].length()) {
						String temp = s[i];
						s[i] = s[j];
						s[j] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String arr[] = { "ABU DHABI", "AMSTERDAM", "PARIS", "LONDON", "ROME", "NAIROBI", "ZURICH", "NEW DELHI",
				"CALIFORNIA" };
		System.out.println("Before Sort:");
		displayarray(arr);
		System.out.println("\nAfter Sort:");
		sortarray(arr);
		displayarray(arr);
	}
}
