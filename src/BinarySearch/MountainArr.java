package BinarySearch;

public class MountainArr {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 3, 1};
        int target = 3;

        int peak = peakIndex(arr);

        int firstTry = binarySearch(arr, target, 0, peak, true);

        if (firstTry != -1) {
            System.out.println(firstTry);
            return;
        }

        int secondTry = binarySearch(arr, target, peak + 1, arr.length - 1, false);

        System.out.println(secondTry);
    }

    static int peakIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end, boolean isAscending) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }

        return -1;
    }
}