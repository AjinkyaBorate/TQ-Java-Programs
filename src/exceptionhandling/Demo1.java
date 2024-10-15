package exceptionhandling;

public class Demo1 {
	public static void showElement(int arr[], int index) {
		System.out.println(arr[index]);
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		try {
			showElement(arr, 10);
			String str = null;
			System.out.println(str.length());
			System.out.println("This line never executed...");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		} catch (NullPointerException ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
