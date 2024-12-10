package array;
import java.util.Arrays;

//Wap to count frequency of each element in array
public class A13 {
	public static void duplicateNum(int arr[]) {
		System.out.print("Duplicate elements are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

	public static void freqOfEachEle(int ar[]) {
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int max = ar[ar.length - 1];

		int[] freq = new int[max + 1];

		for (int num : ar) {
			freq[num]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println(i + " occurs " + freq[i] + " times.");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 4, 1, 3 };
		freqOfEachEle(arr);
	}

}
