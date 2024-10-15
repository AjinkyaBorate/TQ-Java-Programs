package oops.finalkeyword;

/*//1.You need to create mobile phones for apple for a special edition. 
 * In this edition the color of all the phones has to be "Space Grey". 
 * Make sure that the color can never be changed once applied in the system.`
 * 
   2.Write a method to convert currency from rs to dollars. It will take rs
   As input and return the equivalent amount in dollars.The exchange rate is 69.2 rs equals 1$
*/public class FinalDemo {
	int id;
	final String color;
	
	FinalDemo(int id){
		this.id=id;
		color="Space Grey";
	}
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Color of Mobile is :" + color);
	}

	public static void main(String[] args) {
		FinalDemo obj = new FinalDemo(1);
		obj.display();

	}

}
