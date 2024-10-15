package loops.dowhile;

import java.util.Scanner;
public class CalculatorDoWhile {

	public void showMenu()
	{
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. Exit");
		System.out.println(" Enter your choice ");
	}
	public void calculator()
	{
		Scanner sc=new Scanner(System.in);
		char ch=' ';
		do
		{
			showMenu();
			int op=sc.nextInt();
			int res=0;
			if(op!=3)
			{
				System.out.println(" Enter first number ");
				int num1=sc.nextInt();
				System.out.println(" Enter second number ");
				int num2=sc.nextInt();
			
				if(op==1)
					res=num1+num2;
				else if(op==2)
					res=num1-num2;
				System.out.println(" Result is "+res);
				
			}
			else
			{
		
				break;
			}
			System.out.println("Do you want to continue .. (Y/N)");
			ch=sc.next().charAt(0);
			System.out.println(ch);
		}
		while(ch=='Y' || ch=='y');
		System.out.println("Thank you visit again ");
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDoWhile obj=new CalculatorDoWhile();
		obj.calculator();
	}

}



