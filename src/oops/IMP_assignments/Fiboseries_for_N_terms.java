package oops.IMP_assignments;

import java.util.Scanner;

public class Fiboseries_for_N_terms {
	public static void fiboSeries(int n) {
		int first=0,second=1;
		System.out.print("Fiboseries: "+first+" "+second+" ");
		for(int i=3;i<=n;i++) {
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int n = sc.nextInt();
        fiboSeries(n);
        sc.close();
		}
	}

