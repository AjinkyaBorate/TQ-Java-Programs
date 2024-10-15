package oops.statickeyword;

public class StaticVariableDemo {

		private int empID;
		private String empName;
		private String empEmail;
		private long empNumber;
		private double basicSalary;
		private static String companyName;

		static {
			companyName = "TQ pvt ltd";
		}
		
		StaticVariableDemo (int id, String name, String email, long no, double salary) {
			empID = id;
			empName = name;
			empEmail = email;
			empNumber = no;
			basicSalary = salary;
		}

		public void salaryComparison(StaticVariableDemo obj) {
			if (this.basicSalary > obj.basicSalary) {
				System.out.println(this.empName + " is having more salary than " + obj.empName);
			} else {
				System.out.println(obj.empName + " is having more salary than " + this.empName);
			}

		}

		public void display() {
			System.out.println("Employee " + empID + ":  " + empName + "  " + empEmail + "  " + empNumber + "  "
					+ basicSalary + " " + companyName);
		}

		public static void main(String[] args) {
			StaticVariableDemo obj1 = new StaticVariableDemo(1, "Ajinkya", "a21@gmail.com", 9028798888L, 70000.00);
			StaticVariableDemo obj2 = new StaticVariableDemo(2, "John", "john.doe@example.com", 9028791111L, 50000.00);
			obj1.display();
			obj2.display();
			obj1.salaryComparison(obj2);

		}
	}
