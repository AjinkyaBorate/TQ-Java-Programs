package nested_classes.method_local_inner_class;

public class Outer {
	int data_outer;

	public Outer() {
		data_outer = 99;
	}

	public void show() {
		class Inner {
			int data_inner;

			public Inner() {
				data_inner = 999;
			}

			public void showInner() {
				System.out.println(data_outer);
				System.out.println(data_inner);
			}
		}
		Inner in = new Inner();
		in.showInner();
	}

	public static void main(String[] args) {
		Outer o=new Outer();
		o.show();
	}

}
