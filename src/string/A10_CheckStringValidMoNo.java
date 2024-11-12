package string;

////10.Check entered String is valid mobile number.
public class A10_CheckStringValidMoNo {
	public static boolean isValidMoNo(String str) {
		if (str.length() < 10) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar < '0' || currentChar >'9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "9090909090";

		if (isValidMoNo(str)) {
			System.out.println(str + " is a valid mobile number.");
		} else {
			System.out.println(str + " is not a valid mobile number.");
		}
	}
}
