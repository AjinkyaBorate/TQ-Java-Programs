package nested_classes.anonymous_inner_class.using_interface;

interface Switchable {
	public void on();
	public void off();
}

public class DemoInterfaceImplimantor {
	String dname;
	Switchable sw = new Switchable() {

		@Override
		public void on() {
			System.out.println(dname+" is on");
		}

		@Override
		public void off() {
			System.out.println("is off");
		}
	};

	public static void main(String[] args) {
		DemoInterfaceImplimantor d = new DemoInterfaceImplimantor();
		d.sw.on();
		d.sw.off();
	}

}
