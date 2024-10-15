package oops.methodoverloading;
//Create a class Payment having a static method payBill
//If you pay the bill by cash you are not eligible for any discount , method payBill(double amt)
//If you pay by a mode you get 15% discount on the bill , method payBill(double amt, String mode)
public class Payment {	
	public static void payBill(double amt) {
		System.out.println("Your bill is without discount: "+amt);
	}
	public static void payBill(double amt, String mode) {
		
		if (mode=="Cash") {
			System.out.println("You are not eligible for discount");
			payBill(amt);			
		}else if(mode=="Online" || mode=="Net Banking"||mode=="Debit card"||mode=="Credit Card") {
			amt=amt-(amt*15/100);
			System.out.println("Online Payment: ");
			System.out.println("Your bill amount after discount: "+amt);
		}
		
	}

	public static void main(String[] args) {
		payBill(10000.0);
		payBill(15000.0,"Online");
	}

}
