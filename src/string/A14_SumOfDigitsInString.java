package string;
//14. Sum of digits in an String
public class A14_SumOfDigitsInString {
	public static int calculateSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') { 
				sum += ch - '0';
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		String str = "1 4 java";
		int sum = calculateSum(str);
		System.out.println("The sum of digits in the string is: " + sum);
	}
}
