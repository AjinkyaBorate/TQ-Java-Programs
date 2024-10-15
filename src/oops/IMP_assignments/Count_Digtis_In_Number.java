package oops.IMP_assignments;

import java.util.Scanner;

public class Count_Digtis_In_Number {
	void show(int n) {
		int digit=0;
		while(n!=0) {
			n=n/10;
			digit++;
		}
		System.out.println("Number of Digits: "+digit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		
		Count_Digtis_In_Number obj=new Count_Digtis_In_Number();
		obj.show(n);
		sc.close();
	}

}
