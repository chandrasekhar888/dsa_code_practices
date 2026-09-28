package BinarySearch;

import java.util.Arrays;

public class fairCandySwap {

    public static void main(String[] args) {

        int[] aliceSizes = {1,2,5};
        int[] bobSizes = {2,4};

        int[] ans = faircandyswap(aliceSizes, bobSizes);

        System.out.println(Arrays.toString(ans));
    }

    static int[] faircandyswap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int candy : aliceSizes) {
            sumA += candy;
        }

        for (int candy : bobSizes) {
            sumB += candy;
        }

        int diff = (sumB - sumA) / 2;

        Arrays.sort(bobSizes);

        for (int candy : aliceSizes) {

            int target = candy + diff;

            if (binarySearch(bobSizes, target)) {
                return new int[]{candy, target};
            }
        }

        return new int[]{};
    }

    static boolean binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}