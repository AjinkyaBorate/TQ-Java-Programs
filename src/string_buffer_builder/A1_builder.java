package string_buffer_builder;

public class A1_builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ajinkya");

		// 1. Append a string
		sb.append(" Borate");
		System.out.println("After append: " + sb);

		// 2. Insert a string
		sb.insert(5, " Bhausaheb");
		System.out.println("After insert: " + sb);

		// 3. Delete a portion of the string
		sb.delete(5, 10);
		System.out.println("After delete: " + sb);

	}

}
