//simple calculator
package loops.whileloop;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int no1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int no2 = sc.nextInt();
		
		int n=0,no3=0;
		
		while(true) {
			System.out.println("");
			System.out.println("***********Calculator**********");
	        System.out.println("1.Addition");
	        System.out.println("2.Subtraction");
	        System.out.println("3.Multiplication");
	        System.out.println("4.Division");
	        System.out.println("5.Exit");
			System.out.println("");
	        System.out.println("Enter your choice: ");
			n=sc.nextInt();

			switch (n) {
			case 1:
				no3=no1+no2;
				System.out.println("Addition is: "+no3);
				break;
			case 2:
				no3=no1-no2;
				System.out.println("Substraction is: "+no3);
				break;
			case 3:
				no3=no1*no2;
				System.out.println("Multiplication is: "+no3);
				break;
			case 4:
				no3=no1/no2;
				System.out.println("Division is: "+no3);
				break;
			case 5:
				System.out.println("Exiting calculator ");
				break;
			default:
				System.out.println("Enter valid choice ");
				break;
			}
			
			if(n==5) {break;}
			
		}
		sc.close();
	}

}
