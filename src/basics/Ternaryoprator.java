package basics;
//Ternary Operator demo
import java.util.Scanner;

public class Ternaryoprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int num=sc.nextInt();
		
		String msg=(num>0)?"Number is positive":"Number is negative";
		System.out.println(msg);
		sc.close();
	}

}
