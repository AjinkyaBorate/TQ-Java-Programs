package oops.containments;

/*Create a class course having cid, cname
Create a class Student having sid, sname, marks , course object
Create objects of this class:
>Now check number of student in each course 
> Display the student names in course wise
 by getter setter*/
public class Student1 {
	int sid;
	String sname;
	Course1 c;

	public void setID(int sid) {
		this.sid = sid;
	}

	public void setName(String sname) {
		this.sname = sname;
	}

	public void setCourse(Course1 c) {
		this.c = c;
	}

	public int getID() {
		return sid;
	}

	public String getName() {
		return sname;
	}

	public Course1 getCourse() {
		return c;
	}

	public static void main(String[] args) {
		Course1 c1 = new Course1();
		c1.setID(11);
		c1.setName("Java");
		
		Student1 s1 = new Student1();
		s1.setID(1);
		s1.setName(" Amol ");
		s1.setCourse(c1);
		System.out.println(s1.getID() + s1.getName() + s1.getCourse());

	}

}