package oops.containments;

/*Create a class course having cid, cname
Create a class Student having sid, sname, marks , course object
Create objects of this class:
>Now check number of student in each course 
> Display the student names in course wise
*/
public class Student {
	int sid;
	String sname;
	double marks;
	Course course;
	static int objectcount = 0;

	Student(int sid, String sname, double marks, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.course = course;
		objectcount++;

	}

	public String toString() {
		return "Student ID:  " + sid + " Student name: " + sname + " Marks: " + marks + " Course: " + course;
	}
	public static int getCourseCount() {
        return objectcount;
    }

	public static void main(String[] args) {
		Course c1 = new Course(12, "Btech");
		Course c2 = new Course(13, "BSC");
		Course c3 = new Course(14, "BE");

		Student s1 = new Student(1, "Ajinkya", 100.0, c1);
		Student s2 = new Student(2, "Ajinkya", 90.0, c1);
		Student s3 = new Student(3, "Ajinkya", 80.0, c2);
		Student s4 = new Student(4, "Ajinkya", 50.0, c2);
		Student s5 = new Student(5, "Ajinkya", 70.0, c3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("Number of objects created: "+getCourseCount());

	}

}
