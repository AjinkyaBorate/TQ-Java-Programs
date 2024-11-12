package string;
//Take two string arrays and find the common elements between them
public class B4_CommonElementsBetwTwoStrings {

	public static void main(String[] args) {
		String[] array1 = {"aaa","aa","ssss"};
		String[] array2 = {"aaa","ss","www"};
		
		System.out.println("Common elements between the two arrays are:");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					System.out.println(array1[i]);
					break;
				}
			}
		}
	}

}
