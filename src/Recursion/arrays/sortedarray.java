package Recursion.arrays;

public class sortedarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4}; int index =0;
        System.out.println(isSorted(arr,index));
    }
    static boolean isSorted(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }
        return isSorted(arr,index+1);
    }
}
