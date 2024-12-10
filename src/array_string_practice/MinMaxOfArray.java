package array_string_practice;

import java.util.Arrays;

public class MinMaxOfArray {

	public static void main(String[] args) {
		int[] arr = { 101, 12, 3, 43, 5, 63, 7, 8, 9 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("Min: "+min+" Max: "+max);
	}

}
