package loops.forloop;
import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {

		
//		Print first n terms of Fibo Series
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter count: ");
				int n = sc.nextInt();
				int first = 0, second = 1;
				System.out.print("Fibonacci Series:" + first + " " + second);
				for (int i = 3; i <= n; i++) {
					int third = first + second;
					System.out.print(" " + third);
					first = second;
					second = third;
				}
				sc.close();
		}
}
