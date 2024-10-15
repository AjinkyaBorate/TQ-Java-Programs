package oops.object_class;
//object class ie equals class check
public class MyDate {
	int dd, mm, yy;
	
	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("In Equals method");
		MyDate obj = (MyDate) o;
		if (dd == obj.dd && mm == obj.mm && yy == obj.yy)
			return true;
		else
			return false;

	}

	public String toString() {
		return "Date is: " + dd + "/" + mm + "/" + yy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj = new MyDate(24, 9, 2024);
		System.out.println(obj);

		MyDate obj1 = new MyDate(24, 9, 2024);
		System.out.println(obj1);

		boolean b = obj1.equals(obj);
		System.out.println(b);
	}

}
