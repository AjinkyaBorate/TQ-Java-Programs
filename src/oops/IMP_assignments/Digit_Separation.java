package oops.IMP_assignments;

public class Digit_Separation {
	void show(int n) {
		for (int i = n; i > 0; i =i/10) {
			int digit = i % 10;
			System.out.print(digit+" ");
		}
	}
	public static void main(String[] args) {
		Digit_Separation obj=new Digit_Separation();
		obj.show(1234);
		
	}
}
