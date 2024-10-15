package oops.IMP_assignments;
import java.util.Scanner;

public class Twin_Prime {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean areTwinPrimes(int num1, int num2) {
        if (!isPrime(num1) || !isPrime(num2)) {
            return false;
        }
        return (num1 - num2)== 2||(num2-num1==2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (areTwinPrimes(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are twin primes.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not twin primes.");
        }

        scanner.close();
    }
}
