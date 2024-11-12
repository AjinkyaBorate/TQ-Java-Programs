package wrapperClass.basics;

//Show the usaage of Wapper class in covariant return type in which we have a base class which 
//has method getInstance whose return type is Number and derived class overrides it and return Integer.
public class WrapperClassInCovariantReturnType {
	public static void main(String[] args) {
		Base b = new Base();
		System.out.println("Base object returns: " + b.getInstance());

		Base d = new Derived();
		System.out.println("Derived object returns: " + d.getInstance());
	}
}

class Base {
	public Number getInstance() {
		float f=10.4f;
		System.out.println("Base class");
		return f;
	}
}

class Derived extends Base {
	public Integer getInstance() {
		System.out.println("Derived class");
		return 10;
	}
}
