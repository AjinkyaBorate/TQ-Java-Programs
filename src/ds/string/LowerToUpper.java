package ds.string;

//13.Write a Java program to convert lowercase string to uppercase.
public class LowerToUpper {
	public static void lowertoUpper(String str) {
		String str1 = str.toUpperCase();
		System.out.println("To uppercase: "+str1);
	}
	public static void main(String[] args) {
		String str="ajinkya";
		System.out.println("Original String: "+str);
		lowertoUpper(str);
	}

}
