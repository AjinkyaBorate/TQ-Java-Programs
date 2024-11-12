package exceptionhandling.UserDefinedExceptions;

public class Account {
	String name;
	long no;
	double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name,long no,double balance){
		this.name=name;
		this.no=no;
		this.balance=balance;
	}
	public void withdraw(double amt) throws InsufficientBalanceException {
		if(balance<amt) {
			throw new InsufficientBalanceException(balance);
		}else {
			balance=balance-amt;
			System.out.println("Balance after Withdraw: "+balance);
		}
	}
	public void deposite(double amt) {
		balance=balance+amt;
		System.out.println("Balance after deposite: "+balance);
	}
	public String toString() {
		return name+" "+no+" "+balance;
	}
	public static void main(String[] args) throws InsufficientBalanceException {
		Account a=new Account("Ajinkya", 9090909090L,1000);
		System.out.println(a);
		a.deposite(1000);
		a.withdraw(2001);
	}

}
