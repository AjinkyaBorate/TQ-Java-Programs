package oops.methods;
//WAP to print power of number.
import java.util.Scanner;

public class PowerOfNumber {
	public int power(int base,int exponent) {
        int result =1;
		for(int i=1;i<=exponent;i++) {
			result=result*base;
		}
		return result;
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base : ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        PowerOfNumber obj=new PowerOfNumber();
        int result=obj.power(base,exponent);
        
        System.out.println(base+" to the power "+exponent+" is : "+result);
        scanner.close();
	
	}
	

}
