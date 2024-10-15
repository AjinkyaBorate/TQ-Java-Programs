package oops.IMP_assignments;

import java.util.Scanner;
//Check a number is Krishnamurthy or not eg: 341= 3!+4!+1!

public class Check_Krishnamurty {
	public int findFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public  boolean checkKrishnamurty(int n) {
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int digit=temp%10;
			sum=sum+findFactorial(digit);
			temp=temp/10;
		}
		return sum==n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		
		Check_Krishnamurty obj=new Check_Krishnamurty();
		
		if(obj.checkKrishnamurty(n)) {
			System.out.println(n+" is Krishnamurty.");
		}else {
			System.out.println(n+" is not Krishnamurty.");
		}
		sc.close();
	}

}
