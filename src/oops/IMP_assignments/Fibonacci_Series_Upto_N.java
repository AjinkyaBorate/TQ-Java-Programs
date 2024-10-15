package oops.IMP_assignments;

import java.util.Scanner;

public class Fibonacci_Series_Upto_N {
	void show(int n) {
		int first=1,second=2;
		System.out.print("Fibo series : "+first+" "+second+" ");
		int count=2;
		for(int third=first+second;third<=n;third=first+second) {
			System.out.print(third+" ");
			first=second;
			second=third;
			count++;
		}
		System.out.println("\nNumber of terms Upto enter number: "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number (upto N): ");
		int n = sc.nextInt();
		
		Fibonacci_Series_Upto_N obj=new Fibonacci_Series_Upto_N();
		obj.show(n);
		sc.close();
	}

}
