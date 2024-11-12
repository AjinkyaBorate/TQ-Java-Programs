package array.arrayofobjects;
/*4. Create a supplier class having id , name, phone and list of items he supplies and then display the supplier 
who supplies Juice*/
class Supplier {
	private int id;
	private String name;
	private String phone;
	private String[] itemsSupplied;

	public Supplier(int id, String name, String phone, String[] itemsSupplied) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.itemsSupplied = itemsSupplied;
	}

	public boolean suppliesItem(String item) {
		for (String suppliedItem : itemsSupplied) {
			if (suppliedItem.equalsIgnoreCase(item)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Supplier ID: " + id + ", Name: " + name + ", Phone: " + phone + ", Items Supplied: "
				+ String.join(", ", itemsSupplied);
	}
}

public class D_Supplier {
	public static void main(String[] args) {
		Supplier[] suppliers = new Supplier[3];

		suppliers[0] = new Supplier(1, "Supplier A", "123-456-7890", new String[] { "Juice", "Soda" });
		suppliers[1] = new Supplier(2, "Supplier B", "987-654-3210", new String[] { "Milk", "Juice" });
		suppliers[2] = new Supplier(3, "Supplier C", "555-555-5555", new String[] { "Water" });

		System.out.println("Suppliers who supply Juice:");
		for (Supplier supplier : suppliers) {
			if (supplier.suppliesItem("Juice")) {
				System.out.println(supplier);
			}
		}
	}
}
