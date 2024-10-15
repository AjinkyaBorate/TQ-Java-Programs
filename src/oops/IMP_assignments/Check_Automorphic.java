package oops.IMP_assignments;

import java.util.Scanner;

//check no is automorphic or notinput n=25 output Automorphic as 25*25=625

public class Check_Automorphic {
	public boolean checkAutomorphic(int num) {

		int square = num * num;
		while (num != 0) {
			if (num % 10 != square % 10) {
				return false;
			}
			num = num / 10;
			square = square / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int num = sc.nextInt();

		Check_Automorphic obj = new Check_Automorphic();
		if (obj.checkAutomorphic(num)) {
			System.out.println(num+" is Automorphic.");
		} else {
			System.out.println(num+" is not Automorphic.");
		}
		sc.close();
	}

}
