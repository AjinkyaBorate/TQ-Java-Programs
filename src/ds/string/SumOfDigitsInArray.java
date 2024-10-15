package ds.string;

public class SumOfDigitsInArray {

	public static void main(String[] args) {
		int[] arr = { 123, 45, 678, 90 };
		int totalSum = sumOfDigitsInArray(arr);
		System.out.println("The sum of all digits in the array is: " + totalSum);
	}

	public static int sumOfDigitsInArray(int[] arr) {
		int totalSum = 0;

		for (int num : arr) {
			totalSum += sumOfDigits(num);
		}

		return totalSum;
	}

	public static int sumOfDigits(int num) {
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}

}
