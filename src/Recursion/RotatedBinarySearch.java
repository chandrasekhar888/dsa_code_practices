package Recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 1, 2, 3, 4};
        int target = 3;

        int ans = search(arr, target, 0, arr.length - 1);

        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {

        // Target not found
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (arr[start] <= arr[mid]) {

            // Target lies in the sorted left half
            if (target >= arr[start] && target < arr[mid]) {
                return search(arr, target, start, mid - 1);
            }

            // Search right half
            return search(arr, target, mid + 1, end);
        }

        // Right half is sorted
        else {

            // Target lies in the sorted right half
            if (target > arr[mid] && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            }

            // Search left half
            return search(arr, target, start, mid - 1);
        }
    }
}