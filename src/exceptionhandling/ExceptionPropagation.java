package exceptionhandling;

public class ExceptionPropagation {
	void m() {
		@SuppressWarnings("unused")
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println("Exceptiion Handled....");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.p();
		System.out.println("Main Flow");
	}

}
