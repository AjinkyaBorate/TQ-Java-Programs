package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception {
	AccountNotFoundException(String msg){
		super(msg);
	}
}
