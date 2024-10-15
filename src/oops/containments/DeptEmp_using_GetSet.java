package oops.containments;

public class DeptEmp_using_GetSet {
	int did;
	String deptName;
	public void setId(int did) {
		this.did = did;
	}

	public void setName(String deptName) {
		this.deptName = deptName;
	}
	public int getId() {
		return did;
	}

	public String getName() {
		return deptName;
	}
	public String toString() {
        return "Dept ID: " + did + ", Dept Name: " + deptName;
    }

}
