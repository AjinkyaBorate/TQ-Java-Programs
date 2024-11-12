package nested_classes.anonymous_inner_class;

/*Create an interface Payment and implement pay() method in varoius ways eg UPI, Credit card etc using
Anonymous inner class*/
interface Payment {
	void pay(double amount);
}

public class Payments {
	Payment upi = new Payment() {
		@Override
		public void pay(double amount) {
			System.out.println("Paid " + amount + " by UPI");
		}
	};
	Payment creditcard = new Payment() {
		@Override
		public void pay(double amount) {
			System.out.println("Paid " + amount + " by Credit Card");
		}
	};
	Payment debitcard = new Payment() {
		@Override
		public void pay(double amount) {
			System.out.println("Paid " + amount + " by debit Card");
		}
	};

	public static void main(String[] args) {
		Payments p = new Payments();
		p.upi.pay(1000);
		p.creditcard.pay(2000);
		p.debitcard.pay(3000);
	}

}