package oops.containments;

/*Create a class course having cid, cname
Create a class Student having sid, sname, marks , course object
Create objects of this class:
>Now check number of student in each course 
> Display the student names in course wise
 by getter setter*/
public class Course1 {
	private int cid;
	private String cname;

	public void setID(int cid) {
		this.cid = cid;
	}

	public void setName(String cname) {
		this.cname = cname;
	}

	public int getID() {
		return cid;
	}

	public String getName() {
		return cname;
	}

	public String toString() {
		return "Course ID: " + cid + ", Course Name: " + cname;
	}

	public static void main(String[] args) {
		Course1 c = new Course1();
		c.setID(1);
		c.setName("Mngt");
		System.out.println(c);
	}

}
