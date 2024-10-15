package loops.forloop;

import java.util.Scanner;

public class Fibonthterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter which tern u want: ");
		int n = sc.nextInt();
		int first=0,second=1;
		if (n == 1) {
            System.out.println("The " + n + "th term of the Fibonacci series is: " + first);
        } else if (n == 2) {
            System.out.println("The " + n + "th term of the Fibonacci series is: " + second);
        } else {
            int third = 0;
            for (int i = 3; i <= n; i++) {
                third = first + second;
                first = second;
                second = third;
            }
            System.out.println("The " + n + "th term of the Fibonacci series is: " + second);
        }
        
        sc.close();

	}

}
