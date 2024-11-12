package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*5.Create a program that takes a string input and uses the Character class to identify the first non-repeated 
 * character in the string. If all characters are repeated, print an appropriate message
*/public class A5 {
	public static void firstNonRepeatedChar(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			boolean isRepeated = false;
			for (int j = i+1; j < str.length(); j++) {
				if (i!=j&&ch[i] == ch[j]) {
					isRepeated = true;
					break;
				}
			}
			if (!isRepeated) {
				System.out.println("First non-repeated character is: " + ch[i]);
				return;
			}
		}
        System.out.println("no non-repeated character found.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		sc.close();
		firstNonRepeatedChar(str);
	}

}
