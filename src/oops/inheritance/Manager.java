package oops.inheritance;

public class Manager extends Employee {
	int teamsize;
	double bonus;

	public Manager() {
		System.out.println("In default con of manager");
		teamsize=4;
		bonus=1000.0;
	}
	public Manager(int id, String name, String email, long no, double sal, MyDate doj,int teamsize,double bonus) {
		super(id,name,email,no,sal,doj);
		System.out.println("In Para. Cons. of Manager");
		this.teamsize=teamsize;
		this.bonus=bonus;
		
	}
	public void calculateSalary() {
		super.calculateSalary();
		super.netsal=super.netsal+bonus;
	}
	public String toString() {
		return super.toString()+"\nTeamsize: "+teamsize+"\nBonus: "+bonus;
		}
	
	public static void main(String[] args) {
//		Manager obj=new Manager();
//		System.out.println(obj);
		Manager obj1=new Manager(1, "Ajinkya", "Ab@gmail.com",9028798555L, 50000.0, new MyDate(1,1,2020),4,5000.0);
		obj1.calculateSalary();
		System.out.println(obj1);
	}

}
