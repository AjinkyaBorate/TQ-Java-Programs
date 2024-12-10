package array_string_practice;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int first[] = { 1, 2, 3, 4 };
		int sec[] = { 1, 3, 6, 9 };
		int arr[]=new int[first.length+sec.length];
		for(int i=0;i<first.length;i++) {
			arr[i]=first[i];
		}
		for(int i=0;i<sec.length;i++) {
			arr[first.length+i]=sec[i];
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
