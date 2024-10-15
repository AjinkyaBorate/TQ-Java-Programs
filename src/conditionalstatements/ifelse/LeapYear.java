//Write a program to check given year is leap or not.
package conditionalstatements.ifelse;
import java.util.Scanner;
public class LeapYear {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year=sc.nextInt();
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+" is a leap Year");
		}
		else {
			System.out.println(year+"is Not a leap year");
		}
		
		sc.close();
	}

}
