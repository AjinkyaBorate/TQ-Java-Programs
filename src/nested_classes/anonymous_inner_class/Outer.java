package nested_classes.anonymous_inner_class;

/*
 * Syntax: Classname in=new Classname()
 * 			{
 * 			};
 * */
public class Outer {
	public Outer() {
		System.out.println("In Outer constructor");
	}

	Inner in = new Inner(9999) {
		// AIC is subclass of Inner class
		@SuppressWarnings("unused")
		int data_aic;
		{
			data_aic = 999;
		}

		@Override
		public void show() {
			super.show();
			System.out.println("In show of AIC");
		}
	};

	public static void main(String[] args) {
		Outer o = new Outer();
		o.in.show();
	}

}

class Inner {
	int data_inner;

	public Inner() {
		System.out.println("In inner class constuctor");
		data_inner = 999;
	}

	public Inner(int data) {
		data_inner = data;
	}

	public void show() {
		System.out.println("Inner class show()");
		System.out.println("Inner class Data: " + data_inner);

	}
}
