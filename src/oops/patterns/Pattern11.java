package oops.patterns;
import java.util.Scanner;
//1 3 7 15 ...n

public class Pattern11 {
	public void show(int term) {
		int n = 1;

        for (int i = 1; i <= term; i++) {
            System.out.print(n+ " ");
            n = n * 2 + 1 ;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int term = sc.nextInt();

		Pattern11 obj = new Pattern11();
		obj.show(term);
		sc.close();
	}
}
