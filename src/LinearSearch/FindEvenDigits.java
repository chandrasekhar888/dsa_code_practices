package LinearSearch;

public class FindEvenDigits {

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int answer = findNumbers(nums);

        System.out.println(answer);
    }

    static int findNumbers(int[] nums) {

        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {

            int digits = 0;
            int number = nums[i];

            while (number > 0) {

                digits++;

                number = number / 10;
            }

            if (digits % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}
