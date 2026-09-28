package ArraysPractice;

/* Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.



Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]*/


public class SmallNumbers {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        int[] numbers = smaller(nums);
    }

    static int[] smaller(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            int output = 0;
            System.out.print(nums[i] + " -> ");

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    output++;
                    System.out.print(nums[j] + " -> ");

                }
            }
            System.out.println(" Total Count " + output);
        }
        return nums;
    }
}

