package LinearSearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        int target = 10;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

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

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return -1;
    }
}
