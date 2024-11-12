package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	double b;
	public InsufficientBalanceException() {
	}
	InsufficientBalanceException(double b){
		this.b=b;
	}
	public String toString() {
		return b+" Insufficient balance";
	}
}
