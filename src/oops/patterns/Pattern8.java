package oops.patterns;
// 2 4 6 8 10 ...n
import java.util.Scanner;

public class Pattern8 {
	public void show(int terms) {
		int num=0;
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
		Pattern8 obj=new Pattern8();
		obj.show(terms);
		sc.close();
	}

}
