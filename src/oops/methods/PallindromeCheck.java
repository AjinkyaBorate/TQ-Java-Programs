package oops.methods;
//WAP to check pallindrome
public class PallindromeCheck {
	public boolean isPallindrome(int n) {
		int original = n;
		int reverse = 0;
		while (n > 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		return original == reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11221;
		PallindromeCheck obj = new PallindromeCheck();
		boolean isPalindrome = obj.isPallindrome(n);
		if (isPalindrome) {
			System.out.println(n + " is a palindrome.");
		} else {
			System.out.println(n + " is not a palindrome.");
		}
	}

}
