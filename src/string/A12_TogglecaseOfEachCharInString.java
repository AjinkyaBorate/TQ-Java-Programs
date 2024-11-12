package string;

//Write a Java program to toggle case of each character of a string
public class A12_TogglecaseOfEachCharInString {
	public static String togglecase(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (Character.isUpperCase(ch)) {
				charArray[i] = Character.toLowerCase(ch);
			}
			if (Character.isLowerCase(ch)) {
				charArray[i] = Character.toUpperCase(ch);
			}
		}
		return new String(charArray);

	}

	public static void main(String[] args) {
		String str = "Ajinkya";
		System.out.println("Original String: "+str);
		System.out.println("Togglecase String: "+togglecase(str));
	}

}
