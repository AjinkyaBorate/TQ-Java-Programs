package exceptionhandling.UserDefinedExceptions;

public class Password {
	public static void passwordCheck(String password) throws InvalidPasswordException {
		if (password.length() < 8) {
			throw new InvalidPasswordException("Password must be at least 8 characters long.");
		}
		
		char[] charArray = password.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[0];
			if (Character.isLowerCase(ch)) {
				throw new InvalidPasswordException("Password must be at least 8 characters long.");
			}
		}
		
		
		
	}

	public static void main(String[] args) throws InvalidPasswordException {
		String password = "Ajinkyaaa";
		passwordCheck(password);
	}

}
