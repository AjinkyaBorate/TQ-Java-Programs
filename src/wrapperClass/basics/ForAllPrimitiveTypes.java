package wrapperClass.basics;

//Show one example of boxing and unboxing for all 8 primitive data types.
public class ForAllPrimitiveTypes {

	public static void main(String[] args) {
		// byte
		byte b1 = 1;
		Byte obj = b1; // Boxing
		byte b2 = obj;// Unboxing

		// int
		int i1 = 10;
		Integer obj1 = i1; // Boxing
		int i = obj1;// Unboxing

		// float
		float f1 = 1.2f;
		Float obj2 = f1; // Boxing
		float f = obj2;// Unboxing

		// double
		double d1 = 10.0;
		Double obj3 = d1; // Boxing
		double d = obj3;// Unboxing

		// short
		short s = 100;
		Short s1 = s; // Boxing
		short s2 = s1; // Unboxing

		// long
		long l = 10000L; //
		Long lObj = l; // Boxing
		long l1 = lObj; // Unboxing

		// char
		char c = 'A';
		Character cObj = c; // Boxing
		char c1 = cObj; // Unboxing

		// boolean
		boolean bool = true;
		Boolean bObj = bool; // Boxing
		boolean bl = bObj; // Unboxing

		System.out.println("byte: " + b2);
		System.out.println("short: " + s2);
		System.out.println("int: " + i);
		System.out.println("long: " + l1);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c1);
		System.out.println("boolean: " + bl);
	}

}
