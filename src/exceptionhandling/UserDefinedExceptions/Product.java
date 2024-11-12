package exceptionhandling.UserDefinedExceptions;
/*1.In a product inventory system, you want to manage stock levels. If an attempt is made to reduce the stock 
 * below zero when selling a product, an OutOfStockException should be thrown.*/
public class Product {
	int noOfProducts;
	Product(int noOfProducts){
		this.noOfProducts=noOfProducts;
	}
	public void buy(int productsToBuy) throws OutOfStockException {
		if (noOfProducts < productsToBuy) {
			throw new OutOfStockException("Product out of Stock");
		} else {
			noOfProducts = noOfProducts - productsToBuy;
		}

	}
	public String toString() {
		return "Products remaining: "+noOfProducts;
	}
	public static void main(String[] args) throws OutOfStockException {
		Product p = new Product(20);
		p.buy(11);
		System.out.println(p);
	}

}
