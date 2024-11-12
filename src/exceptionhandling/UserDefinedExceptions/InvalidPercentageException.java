package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class InvalidPercentageException extends Exception {
	double p;
	InvalidPercentageException(){
		
	}
	InvalidPercentageException(double p){
		this.p=p;
	}
	public String toString() {
	return p+" is invalid value";
	}
}
