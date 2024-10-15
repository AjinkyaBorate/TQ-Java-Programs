package oops.patterns;
import java.util.Scanner;
//0 1 1 2 3 5 8 13....n
public class Pattern12 {
	public void show(int term) {
		int first = 0,second=1;
		System.out.print("Fiboseries: "+first+" "+second+" ");
        for (int i = 2; i <= term; i++) {
            int third=first+second;
            first=second;
            second=third;
            System.out.print(third+" ");
        }
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int term = sc.nextInt();

		Pattern12 obj = new Pattern12();
		obj.show(term);
		sc.close();
	}
}
