package Recursion.sorting;

import java.util.Arrays;

public class InsertionRec {
    public static void main(String[] args) {
        int[] arr ={3,1,2,4,5};
        int i=1;
        insertion(arr,i);
        System.out.println(Arrays.toString(arr));
    }

     static void insertion(int[] arr, int i) {
        //Base
         if(i==arr.length-1){
             return;
         }

         //Inner lopp
         for (int j = i; j > 0 ; j--) {
             if (arr[j]<arr[j-1]){
                 //swap
                 int temp =arr[j];
                 arr[j] =arr[j-1];
                 arr[j-1]=temp;
             }else {
                 break;
             }
         }

         //Recursion
         insertion(arr,i+1);
    }
}
