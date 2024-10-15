package oops.object_class;
//object class ie equals class check
public class StudentPercentageEqualsCheck {

	String sname;
	int rollno, sub1, sub2, sub3, sub4, sub5;
	double percentage;

	public void setData(String name, int roll, int s1, int s2, int s3, int s4, int s5) {
		sname = name;
		rollno = roll;
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
		sub5 = s5;
	}

	public void calculatePercentage() {
		double total = sub1 + sub2 + sub3 + sub4 + sub5;
		percentage = (total / 500) * 100;
	}

	public void displayGrade() {
		if (percentage > 80) {
			System.out.println("A");
		} else if (percentage > 60) {
			System.out.println("B");
		} else if (percentage > 40) {
			System.out.println("C");
		} else {
			System.out.println("Fail");
		}
	}

	public void dislplay() {
		System.out.println("");
		System.out.print(
				"Student with roll number " + rollno + " and name " + sname + " has " + percentage + "% and grade is ");
		displayGrade();

	}
	public boolean equals(Object o) {
		System.out.println("In Equals method");
		StudentPercentageEqualsCheck obj = (StudentPercentageEqualsCheck) o;
		if (this.percentage==obj.percentage)
			return true;
		else
			return false;

	}
	public String toString() {
		return "Name" + sname + "roll" + rollno + "percentage" + percentage;
	}

	public static void main(String[] args) {

		StudentPercentageEqualsCheck obj = new StudentPercentageEqualsCheck();
		StudentPercentageEqualsCheck obj1 = new StudentPercentageEqualsCheck();

		obj.setData("Aj", 1, 99, 88, 88, 98, 97);
		obj1.setData("ab", 3, 99, 88, 88, 98, 97);

		obj.calculatePercentage();
		obj1.calculatePercentage();

		System.out.println(obj);
		System.out.println(obj1);
		
		obj.dislplay();
		obj1.dislplay();

		boolean b = obj1.equals(obj);
		System.out.println(b);

	}

}
