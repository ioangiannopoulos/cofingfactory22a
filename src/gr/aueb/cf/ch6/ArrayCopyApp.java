package gr.aueb.cf.ch6;

/**
 * Makes an array copy by using
 * utility methods.
 */

import java.util.Arrays;

public class ArrayCopyApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        int[] arr3;

        //System.arraycopy()
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        printArray(arr2);

        // Array class
        arr3 = Arrays.copyOf(arr, arr.length);
        printArray(arr3);
        arr3 = Arrays.copyOfRange(arr, 1, arr.length);
        printArray(arr3);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
