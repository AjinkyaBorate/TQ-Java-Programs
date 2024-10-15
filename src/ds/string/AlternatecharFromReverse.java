package ds.string;
//1.        Show alternate character form String from reverse.
public class AlternatecharFromReverse {
	public static String alternateCharFromReverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i=i-2) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		String reverse = alternateCharFromReverseString("ajinkya");
		System.out.println("Alternate char from reverse string: "+reverse);
	}

}
