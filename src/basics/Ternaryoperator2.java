package basics;
//Ternary Operator demo
import java.util.Scanner;

public class Ternaryoperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second numbre: ");
		int b=sc.nextInt();
		
		
		String msg=(a>b)?"First is max":"Second is max";
		System.out.println(msg);
		sc.close();
	}

}
