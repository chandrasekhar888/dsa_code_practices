package Recursion.sorting;
/*
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] bob = {5, 4, 1, 2, 3};

        for (int i = 0; i < bob.length; i++) {
            boolean swap =false;
            for (int j = 0; j < bob.length -1 -i; j++) {
                if (bob[j] > bob[j + 1]) {
                    int temp = bob[j + 1];
                    bob[j + 1] = bob[j];
                    bob[j] = temp;
                    swap =true;
                }
                if(!swap){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(bob));
    }}
*/


// RECURSION

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 2, 3};

        bubbleSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int length) {

        // Base condition
        if (length == 1) {
            return;
        }

        // One complete pass
        for (int j = 0; j < length - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Recursively sort remaining elements
        bubbleSort(arr, length - 1);
    }
}