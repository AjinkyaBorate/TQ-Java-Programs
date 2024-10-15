package oops.methods;

import java.util.Scanner;

public class Max_Of_Digits {
	public int maxDigit(int n) {
		int max=0;
		int digit=0;
		while (n!=0) {
			digit=n%10;
			if(digit>max) {
				max=digit;
			}
			n=n/10;
		}
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		 
		Max_Of_Digits obj=new Max_Of_Digits();
		int res=obj.maxDigit(n);
		System.out.println("Max is : "+res);
		sc.close();
	}

}
