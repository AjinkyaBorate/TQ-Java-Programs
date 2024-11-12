package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class BookNotAvailableException extends Exception {
	BookNotAvailableException(String msg){
		super(msg);
	}
}
