package array_string_practice;

public class PallindromeCheckString {

	public static void main(String[] args) {
		String str="ajaa";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) 
			System.out.println("Pallindrome");
		else 
			System.out.println("Not Pallindrome");
	}

}
