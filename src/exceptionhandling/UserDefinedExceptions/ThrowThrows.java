package exceptionhandling.UserDefinedExceptions;

import java.io.IOException;

public class ThrowThrows {
	public static void showElement(int arr[], int index) {
		if (index >= arr.length)
			throw new ArrayIndexOutOfBoundsException();
		else
			System.out.println(arr[index]);
	}

	public static void show() throws IOException {
		throw new IOException();
	}

	public static void main(String[] args) throws IOException {
		showElement(new int[] { 1, 2, 3, 4, 5 }, 8);
		show();
	}

}
