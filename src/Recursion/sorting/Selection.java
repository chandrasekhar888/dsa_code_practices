package Recursion.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3};
        int i=0;
        selectionSort(arr,i);
        System.out.println(Arrays.toString(arr));
        }

    private static void selectionSort(int[] arr, int i) {
        if(i==arr.length-1){
            return;
        }
        int min = i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]<arr[min]){
                min=j;
            }

        }
        int temp = arr[min] ;
        arr[min] = arr[i] ;
        arr[i] = temp;
        selectionSort(arr,i+1);

    }
}

