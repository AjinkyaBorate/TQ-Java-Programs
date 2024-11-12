package exceptionhandling.UserDefinedExceptions;
@SuppressWarnings("serial")
class OutOfStockException extends Exception {
	OutOfStockException(String msg)
	{
		super(msg);
	}
}

