package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class InvalidPasswordException extends Exception {

	public InvalidPasswordException(String string) {
		System.out.println("Invalid password...");
	}

}
