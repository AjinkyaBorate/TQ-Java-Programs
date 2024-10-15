package ds.string;

public class FindcharAtIndex {

	public static char findcharAtIndex(String str, int index) {
		char ch = ' ';
		char charr[] = str.toCharArray();
		if (index < str.length() - 1) {
			for (int i = 0; i < charr.length; i++) {
				if (i == index) {
					ch = charr[i];
					break;
				}
			}
		} else {
			System.out.println("index is grater than length");
		}
		return ch;
	}

	public static void main(String[] args) {

		char ch = findcharAtIndex("Programming", 4);
		System.out.println("Char at index is:" + ch);
	}

}
