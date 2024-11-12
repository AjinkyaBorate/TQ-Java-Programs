package exceptionhandling.UserDefinedExceptions;

@SuppressWarnings("serial")
public class CourseFullException extends Exception {
	CourseFullException(String msg){
		super(msg);
	}
}
