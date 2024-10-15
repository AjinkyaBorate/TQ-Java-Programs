package oops.statickeyword;
/* Static Assignment-1.Write Employee Class with attributes like employee_id, name, and salary. 
 * Create parameterized constructor to initialize this 3 attributes, and write a method to 
 * display this information of 5 objects, display total no of employees using static method, 
 * totalEmp(), which will return total no of employees. Also note there should be auto-generation of employee_id.
 * */
public class EmployeeData {

		private int id;
		private String name;
		private double salary;
		private static int count;
		
		EmployeeData(String name,double salary) {
			count++;
			id =count;
			this.name = name;
			this.salary = salary;
		}

		public void display() {
			System.out.println("Employee " + id + ":  " + name +" Salary: "+salary);
		}
		public static int totalEmp() {
			return count;
		}
		public static void main(String[] args) {
			EmployeeData obj1 = new EmployeeData("Ajinkya", 70000.00);
			EmployeeData obj2 = new EmployeeData("John", 50000.00);
			EmployeeData obj3 = new EmployeeData("Abhi", 90000.00);

			obj1.display();
			obj2.display();			
			obj3.display();		
		
			System.out.println("Total Number of emplyees: "+totalEmp());
			}
	}



