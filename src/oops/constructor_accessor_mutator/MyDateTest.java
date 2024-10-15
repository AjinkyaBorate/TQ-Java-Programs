package oops.constructor_accessor_mutator;
//i.e getter and setter method
public class MyDateTest {

	private int dd, mm, yy;

	MyDateTest() {
		System.out.println("This is Default constructor");
		dd = 18;
		mm = 9;
		yy = 2024;

	}

	MyDateTest(int d, int m, int y) {
		System.out.println("This is parametric constructor");
		dd = d;
		mm = m;
		yy = y;

	}

	public void setDay(int d) {
		dd = d;
	}

	public void setMonth(int m) {
		mm = m;
	}

	public void setYear(int y) {
		yy = y;
	}

	public int getDay() {
		return dd;
	}

	public int getMonth() {
		return mm;
	}

	public int getYear() {
		return yy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateTest obj = new MyDateTest();
//		obj.setDay(18);
//		obj.setMonth(9);
//		obj.setYear(2024);
		System.out.println("Date is : " + obj.getDay() + "/" + obj.getMonth() + "/" + obj.getYear());
	
		MyDateTest obj1 = new MyDateTest(19, 9, 2024);
		System.out.println("Date is : " +obj1.dd + "/" + obj1.mm + "/" + obj1.yy);

	}

}
