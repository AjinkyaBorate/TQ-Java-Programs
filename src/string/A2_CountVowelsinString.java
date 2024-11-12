package string;
//3.Check occurrences of particular  character, how many times it’s there and which diff positions.
public class A2_CountVowelsinString {
	public static void count(String str) {
		int vowels = 0, consonants = 0, digits = 0, specialSymbols = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
			} else if (ch >= '0' && ch <= '9') {
				digits++;
			} else {
				specialSymbols++;
			}
			
		}
		System.out.println("Number of Vowels: " + vowels);
		System.out.println("Number of Consonants: " + consonants);
		System.out.println("Number of Digits: " + digits);
		System.out.println("Number of Special Symbols: " + specialSymbols);
	}

	public static void main(String[] args) {
		count("string202#@");
	}

}
