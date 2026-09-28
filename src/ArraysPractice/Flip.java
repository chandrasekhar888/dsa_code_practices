package ArraysPractice;

import java.util.Arrays;

public class Flip {

    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        // Step 1: Flip each row
        for (int row = 0; row < image.length; row++) {

            int left = 0;
            int right = image[row].length - 1;

            while (left < right) {

                int temp = image[row][left];
                image[row][left] = image[row][right];
                image[row][right] = temp;

                left++;
                right--;
            }
        }

        // Step 2: Invert each element
        for (int row = 0; row < image.length; row++) {

            for (int col = 0; col < image[row].length; col++) {

                if (image[row][col] == 0) {
                    image[row][col] = 1;
                } else {
                    image[row][col] = 0;
                }
            }
        }

        // Print the final image
        for (int row = 0; row < image.length; row++) {
            System.out.println(Arrays.toString(image[row]));
        }
    }
}