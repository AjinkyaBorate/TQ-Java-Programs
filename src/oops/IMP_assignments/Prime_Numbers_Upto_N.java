package oops.IMP_assignments;

import java.util.Scanner;

//Prime numbers upto n numbers
public class Prime_Numbers_Upto_N {
	public  boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num/2;i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n=sc.nextInt();
		
		Prime_Numbers_Upto_N obj = new Prime_Numbers_Upto_N();
		for(int i=1;i<=n;i++) {
			if(obj.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
