package string;
//5.Compare two Strings using ==, equals() and compareTo().
public class A5_EqualsAndCompareToMethod {
	public static void equalsAndecompareToMethods() {
		String str1 = "Ajinkya";
		String str2 = "Ajinkya";

		// 1.By "=="
		System.out.println("Checks references(if equals return true)\n" + (str1 == str2));
		
		// 2.By "equals()"
		if (str1.equals(str2)) {
			System.out.println("Both Strings are equal(checks actual content of string)");
		} else {
			System.out.println("Not Equal");
		}
		
		// 3.By "compareTo"
		int n=str1.compareTo(str2);
		System.out.println("Return 0 if strings are equals:\n"+n);

	}

	public static void main(String[] args) {
		equalsAndecompareToMethods();
	}

}
