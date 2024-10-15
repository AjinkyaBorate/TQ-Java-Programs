package oops.patterns;
/**
 * 0101
 * 1010
 * 0101
 * 1010
 */
import java.util.Scanner;

public class SquareforZeroOne {
	public void show(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if((i+j)%2==0) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows & columns: ");
		int n=sc.nextInt();
		
		SquareforZeroOne obj=new SquareforZeroOne();
		obj.show(n);
		
		sc.close();
	}

}
