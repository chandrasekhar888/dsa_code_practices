package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] arr = {5, 4, 2, 1, 3};

        mergeSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {

        // Base Condition
        if (end - start == 1) { //to check elements
            return;
        }

        int mid = (start + end) / 2;

        // Sort Left Half
        mergeSort(arr, start, mid);

        // Sort Right Half
        mergeSort(arr, mid, end);

        // Merge Both Halves
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {

            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}