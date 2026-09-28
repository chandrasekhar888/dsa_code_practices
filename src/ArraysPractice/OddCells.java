package ArraysPractice;

import java.util.Arrays;

public class OddCells {

    public static void main(String[] args) {

        int m = 2;
        int n = 3;

        int[][] indices = {
                {0, 1}
        };

        // Step 1: Create matrix
        int[][] matrix = new int[m][n];

        // Step 2: Process each instruction
        for (int i = 0; i < indices.length; i++) {

            int row = indices[i][0];
            int col = indices[i][1];

            // Increment entire row
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            // Increment entire column
            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }
        }

        // Print matrix after all operations
        System.out.println("Matrix after updates:");

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // Step 3: Count odd cells
        int count = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                if (matrix[row][col] % 2 == 1) {
                    count++;
                }
            }
        }

        System.out.println("Odd Cells = " + count);
    }
}