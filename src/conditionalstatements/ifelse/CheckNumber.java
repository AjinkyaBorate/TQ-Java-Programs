package conditionalstatements.ifelse;
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number to check: ");
	int n=sc.nextInt();
	 if(n==0) {
		 System.out.println("Entered Number is Zero");
	 }else if(n>0) {
		 System.out.println("Number is Positive");
	 }else {
		 System.out.println("Number is Negative");
	 }
	 sc.close();
	}

}
