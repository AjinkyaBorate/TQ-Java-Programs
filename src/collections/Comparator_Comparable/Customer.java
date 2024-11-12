package collections.Comparator_Comparable;

public class Customer implements Comparable<Customer> {
	int custID;
	String name;
	String email;

	public Customer(int custID, String name, String email) {
		this.custID = custID;
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "ID: " + custID + " Name: " + name + " Email: " + email;
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Customer c = new Customer(1, "Ajinkya", "a@gmail.com");
	}

	@Override
	public int compareTo(Customer o) {
		if (this.custID == o.custID)
			return 0;
		else if (this.custID < o.custID)
			return -1;
		else
			return 1;
	}

}
