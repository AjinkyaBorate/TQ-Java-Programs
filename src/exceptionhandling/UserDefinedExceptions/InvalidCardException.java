package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class InvalidCardException extends Exception {
	InvalidCardException(String msg){
		super(msg);
	}
}
