package oops.constructor_accessor_mutator;

public class Account {
	String name;
	long accNo;
	double balance;

	public void insert(String n, long acno, double bal) {
		name = n;
		accNo = acno;
		balance = bal;
	}	
	public void display() {
		
		System.out.println("Name: " + name + "| Account Number: " + accNo + "| Balance: " + balance);

	}
	
	public void withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
			System.out.println("Balance after withdraw of "+amount+" is : "+ balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Balance after deposite of "+amount+" is: "+balance);
	}

	public void checkBalance() {
		System.out.println("New Balance is : " + balance);
	}

	public static void main(String[] args) {

		Account obj = new Account();
		obj.insert("Ajinkya", 101010101L, 2350.0);
		obj.display();
		obj.deposite(2000.0);
		obj.withdraw(1000.0);
		obj.checkBalance();
	}

}
