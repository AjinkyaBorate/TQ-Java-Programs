package oops.inheritance;
//overriding super class method named calculateSal()
public class SalesPerson extends Employee{
	double comm,sales;
	public SalesPerson(int id, String name, String email, long no, double sal, MyDate doj,double comm,double sales){
		super(id,name,email,no,sal,doj);
		this.comm=comm;
		this.sales=sales;
	}
	public void calculateSalary() {
		super.calculateSalary();
		super.netsal=super.netsal+(comm*sales);
	}
	public String toString() {
		return super.toString()+"\nCommision: "+comm+"\nSales: "+sales;
		}
	public static void main(String[] args) {
		SalesPerson sp=new SalesPerson(5, "Aj", "xyz", 99999999999999L, 50000.0, new MyDate(1,2,3), 0.5, 1000);
		sp.calculateSalary();
		System.out.println(sp);
	}

}
