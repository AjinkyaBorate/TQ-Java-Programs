package nested_classes.method_local_inner_class;

import java.util.Scanner;

/*Create a example of method inner class in which there is an outer class called Shopping Mall which 
consist of method doShoping() . Create a local inner class Cart and add items to Cart and display the
bill*/
public class ShoppingMall {

	public void doShopping() {
		class Cart {
			int totalItem;
			double totalbill;

			public void addItem(int quantity, double itemPrice) {
				totalItem += quantity;
				totalbill = (quantity * itemPrice);
			}

			public void displayBill() {
				System.out.println("Your Total Bill for " + totalItem + " items is : " + totalbill);
			}

		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many items do u want:");
		int n = sc.nextInt();
		sc.close();

		Cart c = new Cart();
		c.addItem(n, 10);
		c.displayBill();
	}

	public static void main(String[] args) {
		ShoppingMall sm = new ShoppingMall();
		sm.doShopping();
	}

}
