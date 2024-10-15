package oops.inheritance;

/*Create a base class Student having id , name , Create subclass SchoolStudent having 
* class, schoolName , marks. Create a class CollegeStudent having clgName, sem. 
* Both the class extends Student class, Create object and display them
*/
public class SchoolStudent extends Student {

	int classs;
	String schoolName;
	double marks;

	public SchoolStudent(int id, String name,int classs,String schoolName,double marks) {
		super(id,name);
		this.classs=classs;
		this.schoolName=schoolName;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return super.toString()+" Class: "+classs+" SchoolName: "+schoolName+" Marks: "+marks;
	}
	public static void main(String[] args) {
		SchoolStudent obj=new SchoolStudent(1, "Ajiknya", 11, "MSVS", 98.0);
		System.out.println(obj);
		
	}

}
