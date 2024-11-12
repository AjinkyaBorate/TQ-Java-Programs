package exceptionhandling.UserDefinedExceptions;

public class Student_CustomException //implements Cloneable
{
	int rno;
	String name;
	double percentage;

	public Student_CustomException(int rno, String name, double percentage) throws InvalidPercentageException {
		this.rno = rno;
		this.name = name;
		if (percentage > 100 || percentage < 0)
			throw new InvalidPercentageException(percentage);
		else
			this.percentage = percentage;
	}

	@Override
	public Student_CustomException clone() throws CloneNotSupportedException {
		return (Student_CustomException) super.clone();
	}

	public String toString() {
		return rno + " " + name + " " + percentage;
	}

	public static void main(String[] args) throws InvalidPercentageException ,CloneNotSupportedException{
		Student_CustomException c = new Student_CustomException(1, "Ajinkya", 90);
		System.out.println(c);
		System.out.println(c.hashCode());
		Student_CustomException c1 = c.clone();
		System.out.println(c1);
		System.out.println(c1.hashCode());

	}

}
