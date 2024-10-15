package ds.string;

public class StringlengthwithLogic {
	public static int calculateStrignLength(String str) {
		int len = 0;
		while (true) {
			if (len > str.length() - 1) {
				break;
			} else {
				len++;
			}
		}
		return len;
	}

	public static void main(String[] args) {

		int length = calculateStrignLength("Java");
		System.out.println("Length: " + length);
	}

}
