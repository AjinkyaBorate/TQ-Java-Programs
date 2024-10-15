package oops.constructor_accessor_mutator;

public class AccountData {

	private int accNo;
	private String ownerName;
	private double balance;

	AccountData() {
		System.out.println("This is Default constructor");
		accNo=12344444;
		ownerName="Abhishek";
		balance=5000.0;
	}

	AccountData(int accountNo, String newownerName, double newbalance) {
		System.out.println();
		System.out.println("This is Parametric contructor");
		accNo=accountNo;
		ownerName=newownerName;
		balance=newbalance;

	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		
		AccountData obj = new AccountData();
		System.out.println("Account No: " + obj.getAccNo());
		System.out.println("Owner Name: " + obj.getOwnerName());
		System.out.println("Balance: " + obj.getBalance());
		
		AccountData obj1 = new AccountData(123456789,"Ajinkya",10000.0);

		System.out.println("Account No: " + obj1.getAccNo());
		System.out.println("Owner Name: " + obj1.getOwnerName());
		System.out.println("Balance: " + obj1.getBalance());
	}
}
