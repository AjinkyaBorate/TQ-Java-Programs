package wrapperClass.basics;

public class VarArgDemo {
	public static void add(int n, int m) {
		int res = 0;
		res = n + m;
		System.out.println(res);
	}

	public static void add(int n, int m, int o) {
		int res = 0;
		res = n + m + o;
		System.out.println(res);
	}

	public static void add(int n, int m, int o, int p) {
		int res = 0;
		res = n + m + o + p;
		System.out.println(res);
	}

	public static void add(int... n) {//here we can any type of value (int, float, double, long)
		System.out.print("In var-arg: ");
		int res = 0;
		for (int i : n) {
			res = res + i;
		}
		System.out.println(res);

	}

	public static void main(String[] args) {
		add(1, 2);
		add(1, 2, 3);
		add(1, 2, 3, 4);
		add(1, 2, 3, 4, 5);
	}

}
