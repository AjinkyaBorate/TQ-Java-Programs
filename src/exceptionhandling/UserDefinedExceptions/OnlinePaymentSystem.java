package exceptionhandling.UserDefinedExceptions;

import java.util.Scanner;

/*
 * In an online payment processing system, if a user attempts to make a payment with 
 * an invalid credit card number, an InvalidCardException should be thrown.*/
public class OnlinePaymentSystem {
	double balance = 1000;

	public void deposit(double amt, String str) throws InvalidCardException {
		if (str.length()!=11) {
			throw new InvalidCardException("Invalid Credit card Number");
		} else {
			balance = balance + amt;
			System.out.println("Amount deposited successfully \nNew balance: " + balance);
		}
	}

	public static void main(String[] args) throws InvalidCardException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 digit credit card no: ");
		String str = sc.next();
		System.out.print("Enter amount to deposite: ");
		double a = sc.nextDouble();
		sc.close();
		OnlinePaymentSystem ops = new OnlinePaymentSystem();
		ops.deposit(a, str);
	}

}
