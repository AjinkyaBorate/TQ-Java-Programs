/*If a number is divisible by 3 , print "Hello" if number is divisible by 5 print "Hi" if number is divisible by both 3 and 5 print 
 "welcome" else print the number.*/
package basics;
import java.util.Scanner;
public class TwentyAug {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		
		if (n%3==0 && n%5==0) {
			System.out.println("Welcome");
			
		}
		else if (n%3==0) {
			System.out.println("Hello");
			
		}
		else if (n%5==0 ) {
			System.out.println("Hi");
			
		}
		else {
			System.out.println(n);
		}
		sc.close();
	}

}
