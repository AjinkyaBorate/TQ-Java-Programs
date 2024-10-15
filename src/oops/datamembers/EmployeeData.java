package oops.datamembers;

public class EmployeeData {
    int empID;
    String empName;
    String empEmail;
    long empNumber;
    double basicSalary;

    public void display() {
        System.out.println("Employee " + empID + ":  " + empName + "  " + empEmail + "  " + empNumber + "  " + basicSalary);
    }
    public void setData(int id, String name, String email, long no, double salary) {
        empID = id;
        empName = name;
        empEmail = email;
        empNumber = no;
        basicSalary = salary;
    }
    public static void main(String[] args) {
        EmployeeData obj1 = new EmployeeData();
        EmployeeData obj2 = new EmployeeData();
        EmployeeData obj3 = new EmployeeData();
        EmployeeData obj4 = new EmployeeData();

        obj1.setData(1, "Ajinkya", "a21@gmail.com", 9028798888L, 50000.00);
        obj2.setData(2, "John", "john.doe@example.com", 9028791111L, 60000.00);
        obj3.setData(3, "Emma", "emma.watson@example.com", 9028792222L, 55000.00);
        obj4.setData(4, "Raj", "raj.kumar@example.com", 9028793333L, 58000.00);

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
