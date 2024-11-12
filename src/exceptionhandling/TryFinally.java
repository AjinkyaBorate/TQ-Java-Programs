package exceptionhandling;

public class TryFinally {

	public static void main(String[] args) {
		try {
			String s = "123";
			@SuppressWarnings("unused")
			int n = Integer.parseInt(s);
			System.out.println("After try");
		} finally {
			System.out.println("in finally");
		}

	}

}
