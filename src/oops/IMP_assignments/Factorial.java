package oops.IMP_assignments;
//WAP to calculate factorial of number
public class Factorial {
	
	public int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		Factorial obj=new Factorial();
		int res=obj.fact(4);
		System.out.println("Factorial of number is : "+res);
	}

}
