package oops.patterns;
/*
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * */

import java.util.Scanner;

public class RightHalfPyramidforCharacters {
	public void show(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) ('A' + j - 1));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows: ");
		int n=sc.nextInt();
		
		RightHalfPyramidforCharacters obj=new RightHalfPyramidforCharacters();
		obj.show(n);
		
		sc.close();
	}

}
