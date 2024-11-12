package exceptionhandling.UserDefinedExceptions;

public class Age {
	public static void showAge(int age) throws UnderAgeException {
		if(age<18) {
			throw new UnderAgeException(age);
		}else {
			System.out.println("You are eligible for this post");
		}
	}
	public static void main(String[] args) throws UnderAgeException {
		showAge(17);
	}

}
