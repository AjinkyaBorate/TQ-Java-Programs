package oops.methods;

import java.util.Scanner;

//WAP to check prime number
public class PrimeCheck {
	public  boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if (num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int num=sc.nextInt();		
		PrimeCheck obj=new PrimeCheck();
		if(obj.isPrime(num)) {
			System.out.println("Number is a Prime");
		}
		else {
			System.out.println("Number is not a Prime ");
		}
		sc.close();
	}
	

}
