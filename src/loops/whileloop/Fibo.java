//Fibo series upto 100
package loops.whileloop;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int first = 0, second = 1;
				System.out.print("Fibonacci Series up to 100: " + first + " " + second);
				int third = first + second;
				while (third <= 100) {
					System.out.print(" "+third);
					first = second;
					second = third;
					third=first+second;
				}
	}

}
