package oops.abstract_classes_methods;

/*1.Write a Java program to create an abstract class BankAccount with abstract methods deposit() 
and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
and implement the respective methods to handle deposits and withdrawals for each account type.
 * */
public class Accounts {

	public static void main(String[] args) {
		SavingsAccounnt obj = new SavingsAccounnt(2000, 100);
		obj.deposite();
		obj.withdraw();

		CurrentAccount obj1 = new CurrentAccount(3000, 1000);
		obj1.deposite();
		obj1.withdraw();
	}

}

abstract class BankAccount {
	abstract void deposite();
	abstract void withdraw();
}

class SavingsAccounnt extends BankAccount {
	double balance, amount;

	SavingsAccounnt(double balance, double amount) {
		this.amount = amount;
		this.balance = balance;

	}

	public void deposite() {
		System.out.println("Balance: " + balance);
		System.out.println("Amount want to deposite: " + amount);

		balance = balance + amount;
		System.out.println("After deposit:" + balance);

	}

	public void withdraw() {
		System.out.println("Balance: " + balance);
		System.out.println("Amount want to withdraw: " + amount);
		if (balance > amount)
			balance = balance - amount;
		else
			System.out.println("Insufficient balance");
		System.out.println("After Withdraaw: " + balance);

	}

}

class CurrentAccount extends BankAccount {
	double bal, amt;

	CurrentAccount(double bal, double amt) {
		this.amt = amt;
		this.bal = bal;

	}

	public void deposite() {
		System.out.println("Balance: " + bal);
		System.out.println("Amount want to deposit: " + amt);

		bal = bal + amt;
		System.out.println("After deposit:" + bal);
	}

	public void withdraw() {
		System.out.println("Balance: " + bal);
		System.out.println("Amount want to withdraw: " + amt);
		if (bal > amt)
			bal = bal - amt;
		else
			System.out.println("Insufficient balance");
		System.out.println("After Withdraaw: " + bal);

	}
}