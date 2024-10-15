package oops.patterns;

import java.util.Scanner;

/*
 
 1
 23
 456
 78910 
 
 */
public class RightHalfPyramidwithIncresingNumbers {
	public void show(int n) {
		int count=1;

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows: ");
		int n=sc.nextInt();
		
		RightHalfPyramidwithIncresingNumbers obj=new RightHalfPyramidwithIncresingNumbers();
		obj.show(n);
		
		sc.close();
	}

}
