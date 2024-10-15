package ds.string;

////10.Check entered String is valid mobile number.
public class CheckStringValidMoNo {
	public static void checkValidNumber(String st) {
		if (st.length() == 10) {
			System.out.println(st + " is valid phone number");
		} else {
			System.out.println(st + " not valid phone number");
		}

	}

	public static void main(String[] args) {
		String str = "909090909";
		checkValidNumber(str);
	}
}
