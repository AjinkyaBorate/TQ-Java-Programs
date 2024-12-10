package array_string_practice;

import java.util.Arrays;

public class SplitArrayinTwoParts {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(arr));
		int mid = arr.length / 2;
		int first[] = new int[mid];
		int second[] = new int[arr.length - mid];

		for (int i = 0; i < mid; i++) {
			first[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++) {
			second[i-mid]=arr[i];
		}
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));

	}
}
