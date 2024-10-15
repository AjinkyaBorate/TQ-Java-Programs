package oops.IMP_assignments;
//Find all prime numbers < 100. 
public class Display_Prime_Number {
    void printPrimesUpTo(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Display_Prime_Number obj = new Display_Prime_Number();
        int limit = 100; 
        obj.printPrimesUpTo(limit);
    }
}
