package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class UnderAgeException extends Exception {
	int a;
	public UnderAgeException(int a) {
		this.a=a;
	}
	public String toString() {
		return "Your age "+a+" is below 18";
	}

}
