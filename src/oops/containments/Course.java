package oops.containments;

/*Create a class course having cid, cname
Create a class Student having sid, sname, marks , course object
Create objects of this class:
>Now check number of student in each course 
> Display the student names in course wise
*/
public class Course {
	int cid;
	String cname;
	Course(int cid,String cname){
		this.cid=cid;
		this.cname=cname;
	}
	public String toString() {
		return "Course ID: "+cid+" Course name: "+cname;
	}
}
