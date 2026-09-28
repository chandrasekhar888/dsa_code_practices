package BinarySearch;

import java.util.HashSet;

public class checkIfExist {
    public static void main(String[] args) {
        int[] arr= {14,1,7,11};

        boolean ans = checkIfExis(arr);
        System.out.println(ans);
    }

     static boolean checkIfExis(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if(arr[i] == arr[j]*2|| arr[j] == 2 * arr[i]){
                     return true ;
                 }
             }
         }
        return false;
    }
}
