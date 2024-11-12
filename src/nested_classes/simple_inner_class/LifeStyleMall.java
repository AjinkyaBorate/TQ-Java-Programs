package nested_classes.simple_inner_class;

/*Create a class LifeStyle Mall having mallName, location, custid, custName, mobileNo.
In this class create a member innerclass AnnualPayCard having fields cardid, expiryDate, balance
Create a customer and then alot AnnualPayCard to them.
Display the details of Customer along with card details
 * */
public class LifeStyleMall {
	String mallName;
	String location;
	int custid;
	String custName;
	long mobileNo;

	public void display(String mallName, String location, int custid, String custName, long mobileNo) {
		System.out.println("Mall Name: " + mallName);
		System.out.println("Location: " + location);
		System.out.println("Customer ID: " + custid);
		System.out.println("Customer Name: " + custName);
		System.out.println("Mobile No: " + mobileNo);
	}

	class AnnualPayCard {
		int cardid;
		String expirydate;
		double balance;

		public void display(int cardid, String expirydate, double balance) {

			System.out.println("Card ID: " + cardid);
			System.out.println("Expiry Date: " + expirydate);
			System.out.println("Balance" + balance);
		}
	}

	public static void main(String[] args) {
		LifeStyleMall lcm = new LifeStyleMall();
		lcm.display("AB Mall", "Pune", 1, "Ajinkya", 9090909090L);
		System.out.println("----------------------------------------");
		System.out.println("Annual Paycard for Customer: ");
		LifeStyleMall.AnnualPayCard apc = lcm.new AnnualPayCard();
		apc.display(111, "22/10/2024", 10000);
		;

	}

}
