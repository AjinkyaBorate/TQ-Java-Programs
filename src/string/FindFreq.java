package string;

public class FindFreq {
	public static int findfreq(String str, char ch) {
		int freq = 0;
		char charr[] = str.toCharArray();
		for (int i = 0; i < charr.length; i++) {
			if (charr[i] == ch) {
				freq++;
			}
		}
		return freq;
	}

	public static void main(String[] args) {
		int n = findfreq("ajajaja", 'a');
		System.out.println(n);

	}

}
