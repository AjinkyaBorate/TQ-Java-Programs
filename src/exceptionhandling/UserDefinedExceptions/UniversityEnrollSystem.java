package exceptionhandling.UserDefinedExceptions;

/*
 * In a university enrollment system, a CourseFullException should be raised when a student tries to enroll 
 * in a course that has reached its maximum capacity.*/
public class UniversityEnrollSystem {
	String courseName;
	int courseCapacity;
	int enrolledStudents;

	UniversityEnrollSystem(String courseName, int courseCapacity, int enrolledStudents) {
		this.courseName = courseName;
		this.courseCapacity = courseCapacity;
		this.enrolledStudents = enrolledStudents;
	}

	public void enrollment() throws CourseFullException {
		if (courseCapacity <= enrolledStudents) {
			throw new CourseFullException("Course " + courseName + " is Full");
		}
		enrolledStudents++;
		System.out.println("After new Enrollment, Enrolled Students are: "+enrolledStudents);
	}
	public String toString() {
		return "Course Name: "+courseName+" Course capacity: "+courseCapacity+" Course enrolled Students: "+enrolledStudents;
	}
	public static void main(String[] args) throws CourseFullException {
		UniversityEnrollSystem u=new UniversityEnrollSystem("Java", 60, 59);
		u.enrollment();

	}

}
