package BinarySearch;

public class RotatedSortedArrayII {

    public static void main(String[] args) {

        int[] nums = {2,2,2,3,1};
        int target = 1;

        boolean ans = search(nums, target);

        System.out.println(ans);
    }

    static boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: Target found
            if (nums[mid] == target) {
                return true;
            }

            // Case 2: Duplicates - cannot decide which half is sorted
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            // Case 3: Left half is sorted
            else if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Case 4: Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}