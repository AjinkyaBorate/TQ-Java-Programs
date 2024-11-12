package nested_classes.simple_inner_class;

public class Outer {
	int data_outer;

	public Outer() {
		data_outer = 99;
	}

	public void showOuter() {
		Inner in = new Inner();
		in.showInner();
	}

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

	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.Inner in=o.new Inner();
		in.showInner();
		//or
		Outer.Inner in1=new Outer().new Inner();
		in1.showInner();
	}

}
