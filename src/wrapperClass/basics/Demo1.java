package wrapperClass.basics;

//in this eg it gives first preference to typecasting then boxing
//auto-widning happens over boxing
public class Demo1 {
	public static void mymethod(double d) {
		System.out.println("in double parameter");
	}

	public static void mymethod(Long i) {
		System.out.println("in long parameter");
	}// in double and long it will convert to long

//	public static void mymethod(Integer i) {
//		System.out.println("in Integer parameter");
//	}

	public static void main(String[] args) {
		int i = 21;
		mymethod(i);
	}

}
