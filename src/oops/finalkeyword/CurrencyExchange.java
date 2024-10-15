package oops.finalkeyword;
import java.util.Scanner;
/*2.Write a method to convert currency from rs to dollars. It will take rs
As input and return the equivalent amount in dollars.The exchange rate is 69.2 rs equals 1$
*/
public class CurrencyExchange {
	double rs, dollars;
	final double rate;//use of final keyword
	
	CurrencyExchange(double rs){
		this.rs=rs;
		this.rate=69.2;
		
	}
	
	public double rsToDollars() {
		
		dollars = rs / rate;
		return dollars;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter amount to convert: ");
		double rs=sc.nextDouble();
		
		CurrencyExchange obj=new CurrencyExchange(rs);
		System.out.println("Equivalent dollars: "+obj.rsToDollars());
		sc.close();
	}

}
