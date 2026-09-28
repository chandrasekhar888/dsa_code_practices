package Sorting;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = {5,3,4,2,1};

        for (int i = 0; i < array.length - 1  ; i++) {
            boolean swapped = false ;
            for (int j = 0; j < array.length -1-i ; j++) {

                if(array[j] > array[j+1]){
                    int temp = array[j+1] ;
                    array[j+1] = array[j];
                    array[j] = temp ;
                     swapped = true ;
                }

            }
            if(!swapped){
                break;
            }

        }
        System.out.println(Arrays.toString(array));

    }
}
/* package Sorting;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 2, 1};

        bubble(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {

        boolean swapped;

        // Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {

            swapped = false;

            // For each pass, the last i elements are already sorted
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true;
                }
            }

            // No swap means array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}*/