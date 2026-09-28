package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};

        for (int i = 0; i < arr.length-1; i++) {
            int MinIndex = i ;

            for (int j = i+1; j <arr.length  ; j++) {
                if(arr[j] < arr[MinIndex]){
                    MinIndex = j ;
                }
            }
            int temp = arr[MinIndex] ;
            arr[MinIndex] = arr[i] ;
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
