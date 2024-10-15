package oops.inheritance;
/*Create a base class Student having id , name , Create subclass SchoolStudent having 
* class, schoolName , marks. Create a class CollegeStudent having clgName, sem. 
* Both the class extends Student class, Create object and display them
*/
public class CollegeStudent extends Student {
	String clgName;
	int sem;
	public CollegeStudent(int id, String name,String clgName,int sem) {
		super(id,name);
		this.clgName=clgName;
		this.sem=sem;
		
	}
	@Override
	public String toString() {
		return super.toString()+" College Name: "+clgName+" Semester :"+sem;
	}
	public static void main(String[] args) {
		CollegeStudent obj=new CollegeStudent(2, "Ajinkya", "GCOEJ", 8);
		System.out.println(obj);
	}

}
