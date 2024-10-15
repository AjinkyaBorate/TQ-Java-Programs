package oops.inheritance;
/*Create a base class Student having id , name , Create subclass SchoolStudent having 
* class, schoolName , marks. Create a class CollegeStudent having clgName, sem. 
* Both the class extends Student class, Create object and display them
*/
public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}
	@Override
	public String toString() {
		return "ID: "+id+" Name: "+name;
	}
}
