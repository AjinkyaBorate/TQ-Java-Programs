package string;

//Write a Java program to find highest frequency character in a string and also print count.
public class A11_HighestFreqCharInString {
	public static void highestFrequencyChar(String str) {
		int freq[] = new int[128];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}
		
		char highestFreqChar = '\0';
		int highestFreq = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (freq[ch] > highestFreq) {
				highestFreq = freq[ch];
				highestFreqChar = ch;
			}
		}

		System.out.println(highestFreqChar);

	}

	public static void main(String[] args) {
		String str = "Ajinkaiaaaa";
		highestFrequencyChar(str);
	}

}
