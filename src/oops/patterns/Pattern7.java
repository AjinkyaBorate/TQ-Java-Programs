package oops.patterns;
// 1 3 5 7 9 11 13 15 ... n
import java.util.Scanner;

public class Pattern7 {
	public void show(int terms) {
		int num=1;
		for(int i=1;i<=terms;i++) {
			System.out.print(num+" ");
			num=num+2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of terms : ");
		int terms=sc.nextInt();
		Pattern7 obj=new Pattern7();
		obj.show(terms);
		sc.close();
	}

}
