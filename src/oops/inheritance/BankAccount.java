package oops.inheritance;
/*3.Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
 if the account balance falls below 1000 
*/
public class BankAccount {

	public static void main(String[] args) {
		BaankAccounts obj=new BaankAccounts();
		obj.deposit();
	    obj.withdraw();
	    
	    //Dynamic method dispatch for overriding withdraw()
		BaankAccounts ba=new SavingsAccount();
		ba.withdraw();
	}

}

class BaankAccounts {
	double balance=1000.0;
	double amount=1000.0;

	public void deposit() {
		balance=balance+amount;
		System.out.println("You deposit: "+amount);
		System.out.println("Balance: "+balance);
		System.out.println();

		
	}
	public void withdraw() {
		balance=balance-amount;
		System.out.println("You Withdraw: "+amount);
		System.out.println("Balance: "+balance);
		System.out.println();

	}
}

class SavingsAccount extends BaankAccounts {
	@Override
	public void withdraw() {
		System.out.println("Your Balance: "+balance);
		if(balance<=amount) {
			System.out.println("Insuffucient Balance");
			System.out.println("Your Balance: "+balance);
			System.out.println();

		}else {
			System.out.println();
			balance=balance-amount;
			System.out.println("After withdraw Balance is:"+balance);
			System.out.println();

		}
	}

}
