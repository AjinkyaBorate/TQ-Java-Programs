package ds.string;

import java.util.Scanner;

public class PallindromeString {
	public static void checkPallindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str+" is Pallindrome");
		}else {
			System.out.println(str+" is Not Pallindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.next();
		sc.close();
		checkPallindrome(str);
	}

}
