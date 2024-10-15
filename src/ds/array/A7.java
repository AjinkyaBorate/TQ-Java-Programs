package ds.array;

import java.util.Scanner;

public class A7 {

    public static void reverseArray(int size, int[] arr) {
        for(int i=0;i<arr.length/2;i++) {
        	int temp = arr[i];
        	arr[i]=arr[size-i-1];
        	arr[size-i-1]=temp;
        }
        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.print("Enter " + size + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        reverseArray(size, arr);

    }
}