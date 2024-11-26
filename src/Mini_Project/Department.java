package Mini_Project;

public class Department {
	int deptno;
	String deptName;
	String location;

	public Department(int deptno, String deptName, String location) {
		this.deptno = deptno;
		this.deptName = deptName;
		this.location = location;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptName=" + deptName + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}