package string;

//6.Show occurrence of each character from String
public class A6_OcurrenceOfEachCharInString {
	public static void ocurrence(String str) {
		int freq[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			freq[current]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println("" + (char) i + ":" + freq[i]);
			}
		}
	}
	public static void main(String[] args) {
		String str="ProgrammingpppPPP";
		String str1=str.toLowerCase();
		ocurrence(str1);
	}

}
/*class Test{
	public static void occurence(String str) {
		int arr[]=new int [256];
		for(int i=0;i<str.length();i++) {
			char current=str.charAt(i);
			arr[current]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				System.out.println((char)i+" "+arr[i]);
		}
		
	}
}*/