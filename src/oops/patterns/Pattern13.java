package oops.patterns;

import java.util.Scanner;
//Prime numbers upto n 
public class Pattern13 {
	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Prime numbers upto n: ");
		int n=sc.nextInt();
		
		Pattern13 obj = new Pattern13();
		for(int i=1;i<=n;i++) {
			if(obj.isPrime(i)) {
				System.out.print(i+" ");
			}
			
		}
		sc.close();
	}

}
