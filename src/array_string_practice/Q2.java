package array_string_practice;

/*import java.util.Arrays;

public class Q2 {
	public static void findmissing(int ar[], int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if(!checknum(i, ar))
				count++;
		}
		int missing[]=new int [count];
		int index=0;
		for(int i=1;i<n;i++) {
			if(!checknum(i, ar))
				missing[index++]=i;
		}
		System.out.println(Arrays.toString(missing));
	}

	public static boolean checknum(int n, int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 9};
		Arrays.sort(arr);
		int maxnum = arr[arr.length - 1];
		//System.out.println(maxnum);
		findmissing(arr, maxnum);
	}

}*/

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        Arrays.sort(arr);
        int last = arr[arr.length-1];
        
        ArrayList<Integer> missingNumbers = new ArrayList<>();

        for (int i = 1; i <= last; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(i);
            }
        }
        System.out.println("The missing numbers are: " + missingNumbers);
    }
}
