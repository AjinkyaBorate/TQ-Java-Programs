package nested_classes.anonymous_inner_class.using_interface;

/*2.Create a Java application that simulates basic arithmetic operations using an interface. 
 *Define an interface called Calculator with a method calculate(int a, int b). 
 *Implement this interface using non-static inner classes within an outer class 
 *named CalculatorApp to perform addition and subtraction. The outer class should also have a method 
 *to execute these operations and print the results.*/
interface Calculator {
	public void calculate(int a,int b);
}
public class CalculatorApp {
	Calculator addition=new Calculator() {
		
		@Override
		public void calculate(int a, int b) {
			int res=a+b;
			System.out.println("Addition: "+res);
		}
	};
	Calculator subtraction=new Calculator() {
		
		@Override
		public void calculate(int a, int b) {
			int res=a-b;
			System.out.println("Subtraction: "+res);
		}
	};
	Calculator multiplication=new Calculator() {
		
		@Override
		public void calculate(int a, int b) {
			int res=a*b;
			System.out.println("Multiplication: "+res);
		}
	};
	public static void main(String[] args) {
		CalculatorApp ca=new CalculatorApp();
		ca.addition.calculate(5, 5);
		ca.subtraction.calculate(10, 5);
		ca.multiplication.calculate(5, 5);
	}

}
