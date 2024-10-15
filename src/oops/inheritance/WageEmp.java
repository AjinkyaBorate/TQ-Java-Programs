package oops.inheritance;
//overriding super class method named calculateSal()
public class WageEmp extends Employee {
	double rate,hrs;
	public WageEmp(int id, String name, String email, long no, double sal, MyDate doj,double rate,double hrs){
		super(id,name,email,no,sal,doj);
		this.rate=rate;
		this.hrs=hrs;
	}
	public void calculateSalary() {
		super.calculateSalary();
		super.netsal=super.netsal+(hrs*rate);
	}
	public String toString() {
		return super.toString()+"Rate: "+rate+"Hrs: "+hrs;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmp w=new WageEmp(1, "q", "qc", 11111111111L, 20000,new MyDate(1,2,2020), 300, 8);
		w.calculateSalary();
		System.out.println(w);
	}

}
