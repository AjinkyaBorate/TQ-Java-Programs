package oops.patterns;
import java.util.Scanner;
/*
 
*
** 
***
****

*/

public class LeftHalfPyramid {
	public void show(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 2*(n - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows: ");
		int n=sc.nextInt();
		
		LeftHalfPyramid obj=new LeftHalfPyramid();
		obj.show(n);
		
		sc.close();
	}
}

