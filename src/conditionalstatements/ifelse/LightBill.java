//#Write algorithm to calculate light bill by taking units as a input from user.

package conditionalstatements.ifelse;

import java.util.Scanner;

public class LightBill {
	 public static void main(String[] args) {
	        int rate;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Units Used: ");
	        int units = sc.nextInt();

	        if (units < 100) {
	            rate = 2 * units;
	        }
	        else if (units < 300) {
	            rate = (100*2)+5*(units-100);
	        }
	        else { 
	            rate =(100 * 2) + 5 * 200 + 10 * (units - 300);
	        }
	        System.out.println(rate);
	        sc.close();
	    }
}
