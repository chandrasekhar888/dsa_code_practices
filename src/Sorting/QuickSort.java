package Sorting;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 2, 1, 3};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums, int low, int hi) {
        // Base Condition
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;

        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            // Move left pointer until element >= pivot
            while (nums[s] < pivot) {
                s++;
            }
            // Move right pointer until element <= pivot
            while (nums[e] > pivot) {
                e--;
            }
            // Swap if pointers haven't crossed
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;

                s++;
                e--;
            }
        }
        // Sort left part
        sort(nums, low, e);

        // Sort right part
        sort(nums, s, hi);
    }
}
