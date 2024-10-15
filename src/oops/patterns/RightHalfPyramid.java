package oops.patterns;

import java.util.Scanner;

/*
 
 *
 ** 
 ***
 ****
 
 */
public class RightHalfPyramid {
	public void show(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows: ");
		int n=sc.nextInt();
		
		RightHalfPyramid obj=new RightHalfPyramid();
		obj.show(n);
		
		sc.close();
	}

}
