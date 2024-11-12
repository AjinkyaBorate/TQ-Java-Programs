package exceptionhandling.UserDefinedExceptions;

import java.io.FileNotFoundException;

class Parent {
	public void show() throws FileNotFoundException, ClassNotFoundException, NullPointerException {
	}
}

public class Child extends Parent {
	public void show() throws FileNotFoundException, ClassNotFoundException {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
