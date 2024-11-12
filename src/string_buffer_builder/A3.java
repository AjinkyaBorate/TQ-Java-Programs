package string_buffer_builder;

public class A3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println("Initial capacity: " + sb.capacity());
		sb.append(" World! This is a longer string to check capacity increase.");
		System.out.println("Capacity after append: " + sb.capacity());
	}
}
