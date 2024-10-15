package oops.patterns;
//1 4 9 16 25 36 49 ... n
import java.util.Scanner;

public class Pattern9 {
	public void show(int terms) {
		for (int i = 1; i <= terms; i++) {
			System.out.print(i * i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int terms = sc.nextInt();
		Pattern9 obj = new Pattern9();
		obj.show(terms);
		sc.close();
	}

}
