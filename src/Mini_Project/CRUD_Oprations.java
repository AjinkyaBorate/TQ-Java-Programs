package Mini_Project;

/*Department
 *   -deptno,deptname,location
 * Employee
 *    -empid,ename,basicsal,pf,hra,da,netsal,Department obj,ArrayList<String>skill
 *     calcualteSal()
 *     setter and getters
 *     constructors
 *     toString
 * CURD:
 *  - Create a ArrayList<Employee> and add 10 object
 *  - perform delete operation by accepting id or name    
 *  - perform update operation by passing id and information that can be changable
 *  - Display all employees
 *  - Display employee by providing id ,name,dept*/
import java.util.ArrayList;
import java.util.Arrays;

public class CRUD_Oprations {
	public static ArrayList<Employee> createEmpList() {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101, "Rahul", 55000.0, new Department(11, "Dev", "Mumbai"),
				new ArrayList<String>(Arrays.asList("Java", "Spring", "SQL"))));
		emplist.add(new Employee(102, "Anjali", 48000.0, new Department(12, "QA", "Delhi"),
				new ArrayList<String>(Arrays.asList("Testing", "Selenium", "SQL"))));
		emplist.add(new Employee(103, "Ramesh", 47000.0, new Department(13, "Support", "Bangalore"),
				new ArrayList<String>(Arrays.asList("Linux", "Shell Scripting", "Python"))));
		emplist.add(new Employee(104, "Priya", 60000.0, new Department(14, "DevOps", "Hyderabad"),
				new ArrayList<String>(Arrays.asList("AWS", "Docker", "Kubernetes"))));
		emplist.add(new Employee(105, "Arjun", 52000.0, new Department(15, "HR", "Chennai"),
				new ArrayList<String>(Arrays.asList("Recruitment", "Management", "Excel"))));
		emplist.add(new Employee(106, "Sneha", 59000.0, new Department(16, "Finance", "Pune"),
				new ArrayList<String>(Arrays.asList("Accounting", "Tally", "Excel"))));
		emplist.add(new Employee(107, "Vikram", 62000.0, new Department(17, "Dev", "Kolkata"),
				new ArrayList<String>(Arrays.asList("Java", "Hibernate", "SQL"))));
		emplist.add(new Employee(108, "Kavya", 53000.0, new Department(18, "Marketing", "Jaipur"),
				new ArrayList<String>(Arrays.asList("SEO", "Content Writing", "Digital Marketing"))));
		emplist.add(new Employee(109, "Amit", 58000.0, new Department(19, "Sales", "Ahmedabad"),
				new ArrayList<String>(Arrays.asList("Negotiation", "CRM", "Lead Generation"))));
		emplist.add(new Employee(110, "Pooja", 61000.0, new Department(20, "IT", "Lucknow"),
				new ArrayList<String>(Arrays.asList("Networking", "Security", "Python"))));
		return emplist;
	}

	public static void deleteEmp(ArrayList<Employee> al, int id) {
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getEmpID() == id) {
				al.remove(i);
				System.out.println("Employee with ID " + id + " deleted successfully.");
				return;
			}
		}
		System.out.println("No employee found with ID " + id);
	}

	public static void main(String[] args) {
		ArrayList<Employee> eal1 = createEmpList();
		for (Employee e : eal1) {
			System.out.println(e);
		}
		System.out.println();
		deleteEmp(eal1, 101);
		System.out.println();
		System.out.println("Employee list After deletion: ");
		for (Employee e : eal1) {
			System.out.println(e);
		}
	}

}
