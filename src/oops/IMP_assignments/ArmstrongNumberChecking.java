package oops.IMP_assignments;
import java.util.Scanner;

public class ArmstrongNumberChecking {
	public boolean armstrongCheck(int n) {
		int original=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		return sum==original;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int n=sc.nextInt();
		
		ArmstrongNumberChecking obj=new ArmstrongNumberChecking();
		boolean armstrongCheck=obj.armstrongCheck(n);
		
		if(armstrongCheck) {
			System.out.println(n+" is Armstrong Number");
		}else {
			System.out.println(n+" is not Armstrong Number");
			
		}
		sc.close();
		
	}

}
