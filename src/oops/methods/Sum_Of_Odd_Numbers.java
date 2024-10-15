package oops.methods;

public class Sum_Of_Odd_Numbers {
	void show() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum is : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_Of_Odd_Numbers obj = new Sum_Of_Odd_Numbers();
		obj.show();
	}

}
