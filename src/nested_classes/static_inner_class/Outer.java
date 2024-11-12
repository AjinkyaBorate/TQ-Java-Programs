package nested_classes.static_inner_class;

public class Outer {
	int data_outer;

	public Outer() {
		data_outer = 1000;
	}

	public void showouter() {
		System.out.println("Outer Data: " + data_outer);
		Inner inner = new Inner();
		inner.show();
	}

	static class Inner {
		int data_inner;

		public Inner() {
			data_inner = 100;
		}

		public void show() {
			System.out.println("Inner data: " + data_inner);
			// System.out.println("Outer data: "+data_outer); we cannot access data members
			// of outer class
			// we can acess only static members of outer class
		}
	}

	public static void main(String[] args) {
//		Outer o=new Outer();
//		o.showouter();
		Outer.Inner in = new Outer.Inner();// we can access static block without creating instance of outer class
		in.show();
	}

}
