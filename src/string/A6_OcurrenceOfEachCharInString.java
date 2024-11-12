package string;

//6.Show occurrence of each character from String
public class A6_OcurrenceOfEachCharInString {
	public static void ocurrence(String str) {
		int freq[] = new int[1000];

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			freq[current]++;
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println("" + (char) i + ":" + freq[i]);
			}
		}
	}

	public static void main(String[] args) {
		ocurrence("Programming");
	}

}
